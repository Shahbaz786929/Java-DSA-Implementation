package CDAC.CustomArrayList;

public class ArrayListException {

    public static class InvalidIndexException extends IndexOutOfBoundsException {
        public InvalidIndexException(String message) {
            super(message);
        }
    }

    public static class EmptyListException extends RuntimeException {
        public EmptyListException(String message) {
            super(message);
        }
    }

    public static class InvalidCapacityException extends IllegalArgumentException {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }
}
