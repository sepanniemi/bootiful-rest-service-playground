package com.sepanniemi.bootiful.sample.resource;

import com.sepanniemi.bootiful.sample.model.Car;
import com.sepanniemi.bootiful.sample.model.Cars;
import com.sepanniemi.bootiful.sample.model.ImmutableCars;
import com.sepanniemi.bootiful.sample.service.CarService;
import io.reactivex.Single;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sepanniemi on 08/12/16.
 */
@RestController
@Slf4j
public class CarsResource {

    private CarService carService;

    public CarsResource(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/cars")
    public Single<Cars> getCars() {
        return carService
                .findAllCars()
                .doAfterNext(cars-> log.trace("found cars={}", cars) )
                .map(CarsResource::wrapCars)
                .singleOrError();
    }

    private static Cars wrapCars(List<Car> cars) {
        return ImmutableCars
                .builder()
                .addAllCars(cars)
                .build();
    }

}
