package com.kodilla.testing.shape;
import com.kodilla.testing.shape.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD: shape collector test suite")
public class ShapeCollectorTestSuite {
    static int testNumber = 0;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Starting test suite");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Ending test suite");
    }

    @BeforeEach
    public void beforeEach(){
        testNumber++;
        System.out.println("Preparing to execute test #" + testNumber);
    }


    @Nested
    @DisplayName("Operation on collection shapeList")
    class TestCollectionOperations{

        @Test
        void testAddFigure(){
            Circle circle = new Circle(2.22);
            Square square = new Square(3.23);
            Triangle triangle = new Triangle(4.36);
            ShapeCollector shapeCollector = new ShapeCollector();

            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            assertEquals(3, shapeCollector.getShapeQuantity());
        }
        @Test
        void testRemoveEmptyFigure(){
            Circle circle = new Circle(2.22);
            Square square = new Square(3.23);
            Triangle triangle = new Triangle(4.36);
            ShapeCollector shapeCollector = new ShapeCollector();

            assertFalse(shapeCollector.removeFigure(circle));
        }
        @Test
        void testRemoveFigure(){
            Circle circle = new Circle(2.22);
            Square square = new Square(3.23);
            Triangle triangle = new Triangle(4.36);
            ShapeCollector shapeCollector = new ShapeCollector();

            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            assertTrue(shapeCollector.removeFigure(circle));
            assertEquals(2, shapeCollector.getShapeQuantity());
        }

    }

    @Nested
    @DisplayName("Geting infrormarion from collection shapeList")
    class TestInformationCollection{

        @Test
        void testGetFigure() {
            Circle circle = new Circle(2.22);
            Square square = new Square(3.23);
            Triangle triangle = new Triangle(4.36);
            ShapeCollector shapeCollector = new ShapeCollector();

            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            assertEquals(circle, shapeCollector.getFigure(0));
        }
        @Test
        void testShowFigures() {
            Circle circle = new Circle(2.22);
            Square square = new Square(3.23);
            Triangle triangle = new Triangle(4.36);
            ShapeCollector shapeCollector = new ShapeCollector();

            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            assertEquals(circle.getShapeName() + square.getShapeName() + triangle.getShapeName(),
                    shapeCollector.showFigures());
        }

    }
}
