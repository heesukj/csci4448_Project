package com.stockscore_new.data.repository;

import com.stockscore_new.data.entity.Share;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by heesukjang on 11/28/17.
 */

@Repository
public interface ShareRepository extends CrudRepository<Share, Integer> {

    String sendEmail(Share share);
}
