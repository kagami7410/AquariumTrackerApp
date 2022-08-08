package com.aquatics.aqarium_tracker.components;

import com.aquatics.aqarium_tracker.models.FishTank;
import com.aquatics.aqarium_tracker.models.User;
import com.aquatics.aqarium_tracker.repositories.FishTankRepoitory;
import com.aquatics.aqarium_tracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import java.util.Arrays;


@Component
public class dataloader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FishTankRepoitory fishTankRepoitory;

    @Override
    public void run(ApplicationArguments args) throws Exception {




        User user1 = new User("sujangurung10@gmail.com", "Sujan", "password");
        User user2 = new User("kayaSen@gmail.com", "Kaya", "password2");
        userRepository.saveAll(Arrays.asList(user1, user2));

        FishTank fishTank1 = new FishTank("AquaOne 90", user1);
        FishTank fishTank2 = new FishTank("Fluval 240", user2);
        FishTank fishTank3 = new FishTank("Fluval Evo 15", user1);
        fishTankRepoitory.saveAll(Arrays.asList(fishTank1, fishTank2, fishTank3));






    }
}
