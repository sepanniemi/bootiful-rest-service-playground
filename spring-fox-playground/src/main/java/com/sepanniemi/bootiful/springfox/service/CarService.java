package com.sepanniemi.bootiful.springfox.service;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.sepanniemi.bootiful.springfox.model.Car;
import com.sepanniemi.bootiful.springfox.model.ImmutableCar;
import io.reactivex.Observable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;

/**
 * Created by sepanniemi on 07/04/2017.
 */
@Service
public class CarService {

    public Observable<List<Car>> findAllCars() {
        return Observable.fromFuture(findCarsAsync());
    }

    private static Future<List<Car>> findCarsAsync() {
        return new HystrixCommand<List<Car>>(HystrixCommandGroupKey.Factory.asKey("get_cars")) {
            @Override
            protected List<Car> run() throws Exception {
                return Collections.singletonList(ImmutableCar
                        .builder()
                        .manufacturer("Honda")
                        .model("Civic")
                        .description("Siisti sivikki")
                        .build());
            }
        }.queue();
    }
}
