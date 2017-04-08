package com.sepanniemi.bootiful.sample.service;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.sepanniemi.bootiful.sample.model.Car;
import com.sepanniemi.bootiful.sample.model.ImmutableCar;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;

/**
 * Created by sepanniemi on 07/04/2017.
 */
@Service
@Slf4j
public class CarService {

    public Observable<List<Car>> findAllCars() {
        log.debug("Find all cars...");
        return Observable
                .fromFuture(findCarsAsync())
                .observeOn(Schedulers.computation());
    }

    private static Future<List<Car>> findCarsAsync() {
        return new HystrixCommand<List<Car>>(HystrixCommandGroupKey.Factory.asKey("get_cars")) {
            @Override
            protected List<Car> run() throws Exception {
                log.debug("Executing hystrix command to get the cars..");
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
