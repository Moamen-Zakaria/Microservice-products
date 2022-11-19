package moamen.microservice.recommendationservice.services;

import moamen.microservice.core.recommendation.Recommendation;
import moamen.microservice.core.recommendation.RecommendationService;
import moamen.microservice.util.http.ServiceUtil;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RecommendationServiceImpl implements RecommendationService {

    private ServiceUtil serviceUtil;

    public RecommendationServiceImpl(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }

    @Override
    public List<Recommendation> getRecommendations(int productId) {
        return Arrays.asList(
                new Recommendation(
                        productId,
                        33,
                        "author",
                        5,
                        "some content",
                        serviceUtil.getServiceAddress())
        );
    }
}
