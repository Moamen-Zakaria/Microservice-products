package moamen.microservice.reviewservice.services;

import moamen.microservice.core.review.Review;
import moamen.microservice.core.review.ReviewService;
import moamen.microservice.util.http.ServiceUtil;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ReviewServiceImpl implements ReviewService {

    private final ServiceUtil serviceUtil;

    public ReviewServiceImpl(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }

    @Override
    public List<Review> getReviews(int productId) {
        return Arrays.asList(
                new Review(
                        productId,
                        4,
                        "Author",
                        "good review",
                        "good product",
                        serviceUtil.getServiceAddress())
        );
    }
}
