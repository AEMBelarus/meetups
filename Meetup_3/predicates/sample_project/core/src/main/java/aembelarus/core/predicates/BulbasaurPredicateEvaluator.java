package aembelarus.core.predicates;

import com.day.cq.search.Predicate;
import com.day.cq.search.eval.AbstractPredicateEvaluator;
import com.day.cq.search.eval.EvaluationContext;
import com.day.cq.search.eval.XPath;
import org.apache.felix.scr.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by viktor.kadol on 28.04.16.
 */
@Component(metatype = false, factory = "com.day.cq.search.eval.PredicateEvaluator/bulbasaur")
public class BulbasaurPredicateEvaluator extends AbstractPredicateEvaluator {

    public static final String PE_NAME = "bulbasaur";
    public static final String PE_PATH = "path";

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public String getXPathExpression(Predicate predicate, EvaluationContext context) {
        if (!predicate.hasNonEmptyValue(PE_NAME)) {
            return null;
        }
        String xpath = "jcr:contains(" + predicate.get(PE_PATH, ".") + ", " +
                XPath.getFulltextStringLiteral(predicate.get(PE_NAME)) + ")";
        logger.info("xpath: " + xpath);
        return xpath;
    }

    @Override
    public boolean canXpath(Predicate predicate, EvaluationContext context) {
        return true;
    }

    @Override
    public boolean canFilter(Predicate predicate, EvaluationContext context) {
        return false;
    }
}
