package FamilyTree.model.Human.comparators;

import FamilyTree.model.Human.interfacee.GetGroup;

import java.util.Comparator;

public class SortByAge<T extends GetGroup> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
