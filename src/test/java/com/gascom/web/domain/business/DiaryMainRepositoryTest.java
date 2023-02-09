package com.gascom.web.domain.business;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DiaryMainRepositoryTest{

    @Autowired
    DiaryMainRepository diaryMainRepository;

    @After
    public void cleanup() {
        diaryMainRepository.deleteAll();
    }

    @Test
    public void JPA_TEST() {
        //given
        diaryMainRepository.save(
                DiaryMain.builder()
                .creID("wooris")
                .build());

        //when
        List<DiaryMain> postsList = diaryMainRepository.findAll();

        //then
        DiaryMain diaryMain = postsList.get(0);
        assertThat(diaryMain.getCreID(), is("wooris"));
    }

}
