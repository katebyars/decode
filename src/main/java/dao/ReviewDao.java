package dao;

import models.Review;

import java.util.List;

/**
 * Created by Guest on 8/16/17.
 */
    public interface ReviewDao {

        //create
        void add (Review review);

        //read
        List<Review> getAll();

        Review findById(int id);

        List<Review> findByCodeSchoolId(int codeSchoolId);

        //update
        void update(int id, String content, int rating, int codeSchoolId);

        //delete
        void deleteById(int id);

        void clearAllReviews();

    }

