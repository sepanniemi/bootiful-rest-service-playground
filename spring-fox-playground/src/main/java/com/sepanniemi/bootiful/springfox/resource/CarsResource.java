package com.sepanniemi.bootiful.springfox.resource;

import com.sepanniemi.bootiful.springfox.model.Car;
import com.sepanniemi.bootiful.springfox.model.Cars;
import com.sepanniemi.bootiful.springfox.model.ImmutableCars;
import com.sepanniemi.bootiful.springfox.service.CarService;
import io.reactivex.Single;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sepanniemi on 08/12/16.
 */
@RestController
public class CarsResource {

    private CarService carService;

    public CarsResource(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/cars")
    public Single<Cars> getCars() {
        return carService
                .findAllCars()
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
