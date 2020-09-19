package UserBucket;

import Product.ProductEntity;

import java.util.ArrayList;
import java.util.List;

public class UserBucket {
    private static UserBucket userBucket;
    private StringBuilder summary = new StringBuilder();
    private List<ProductEntity> bucket = new ArrayList<>();

    public static UserBucket getInstance() {
        if (userBucket == null) {
            userBucket = new UserBucket();
        }
        return userBucket;
    }

    public List<ProductEntity> getBucket() {
        return bucket;
    }

    public void clearBucket() {
        bucket.clear();
    }

    public StringBuilder getSummary() {
        return summary;
    }
}
