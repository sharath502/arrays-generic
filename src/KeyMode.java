public interface KeyMode {
    public abstract KeyMode deepCopy();
    public abstract int compareTo(Object target);
    public abstract String toString();
}
