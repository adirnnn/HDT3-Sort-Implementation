package uvg.edu.gt;

public enum ProcessingType {
    SORTED, UNSORTED;

    public static ProcessingType getTypeByOrdinal(int ordinal) {
        for(ProcessingType t : ProcessingType.values()) {
            if(t.ordinal() == ordinal) {
                return t;
            }
        }

        return null;
    }

}
