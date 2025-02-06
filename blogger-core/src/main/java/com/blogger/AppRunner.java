package com.blogger;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class AppRunner implements CommandLineRunner {

    private final BloggerRepository bloggerRepository;

    @Override
    public void run(String... args) throws Exception {
        Blogger blogger1 = Blogger.builder().post("FIRST POST").build();
        bloggerRepository.save(blogger1);
        log.info("FIRST POST SAVE: {}", blogger1);

        Blogger blogger2 = Blogger.builder().post("SECOND POST").build();
        bloggerRepository.save(blogger2);
        log.info("SECOND POST SAVE: {}", blogger2);
    }
}
