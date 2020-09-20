package usersbucket;

import product.ProductEntity;

import java.util.ArrayList;
import java.util.List;

public class UsersBucket {
    private static UsersBucket userBucket;
    private StringBuilder summary = new StringBuilder();
    private List<ProductEntity> bucket = new ArrayList<>();

    public static UsersBucket getInstance() {
        if (userBucket == null) {
            userBucket = new UsersBucket();
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
