package com.endyary.patterns.behavioral;

import com.endyary.patterns.behavioral.chainofresponsibility.*;
import org.junit.jupiter.api.Test;

public class ChainOfRespTest {
    @Test
    void emailHandlerTest() {
        EmailHandler primaryEmailHandler = new PrimaryEmailHandler(EmailType.PRIMARY);
        EmailHandler socialEmailHandler = new SocialEmailHandler(EmailType.SOCIAL);
        EmailHandler promotionEmailHandler = new PromotionEmailHandler(EmailType.PROMOTION);

        primaryEmailHandler.setNextHandler(socialEmailHandler);
        socialEmailHandler.setNextHandler(promotionEmailHandler);

        primaryEmailHandler.handle(EmailType.PRIMARY, "New Primary Email");
        primaryEmailHandler.handle(EmailType.SOCIAL, "New Social Email");
        primaryEmailHandler.handle(EmailType.PROMOTION, "New Promotion Email");
    }
}
