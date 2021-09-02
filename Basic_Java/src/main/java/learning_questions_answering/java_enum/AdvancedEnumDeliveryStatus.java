package learning_questions_answering.java_enum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdvancedEnumDeliveryStatus {

    public enum DeliveryStatus {

        ORDERED(5) {
            @Override
            public boolean isOrdered() {
                return true;
            }
        },
        READY(2) {
            @Override
            public boolean isReady() {
                return true;
            }
        },
        DELIVERED(0) {
            @Override
            public boolean isDelivered() {
                return true;
            }
        };

        private int timeToDelivery;

        // constructor to initialize Delivery Status
        DeliveryStatus(int timeToDelivery) {
            this.timeToDelivery = timeToDelivery;
        }

        // enum can have method like any other class
        public boolean isOrdered() {
            return false;
        }

        public boolean isReady() {
            return false;
        }

        public boolean isDelivered() {
            return false;
        }
    }

    public class Pizza {
        private String name;
        private String description;
        private DeliveryStatus status;

        public Pizza(String name, String description, DeliveryStatus status) {
            this.name = name;
            this.description = description;
            this.status = status;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public DeliveryStatus getStatus() {
            return status;
        }

        public void setStatus(DeliveryStatus status) {
            this.status = status;
        }
    }

    @Test
    public void testDeliveryStatus() throws InterruptedException {

        Pizza pizza = new Pizza("double cheese", "very tasty", DeliveryStatus.ORDERED);
        Thread.sleep(2000);
        pizza.setStatus(DeliveryStatus.READY);

        assertEquals(2, pizza.getStatus().timeToDelivery);
        assertTrue(pizza.getStatus().isReady());
    }
}
