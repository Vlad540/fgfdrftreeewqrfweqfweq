package androidx.work.impl.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\f\u001a\u00020\bH'¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000e\u0010\u0010J'\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\rH'¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0015\u0010\u000fJ\u001d\u0010\u0016\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\rH'¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u0006J\u001d\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0017¢\u0006\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Landroidx/work/impl/model/WorkersQueueDao;", "", "Ljuf;", "item", "Ljue;", "insertOrIgnore", "(Ljuf;)V", "insertOrReplace", "", "state", "count", "(I)I", "limit", "", "select", "(I)Ljava/util/List;", "(II)Ljava/util/List;", "", "ids", "updateState", "(ILjava/util/List;)V", "getItemsForRunning", "delete", "(Ljava/util/List;)V", "workerQueueItem", "insert", "", "contains", "(Ljava/util/List;)Z", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public interface WorkersQueueDao {
    boolean contains(List<String> list) {
        List<juf> select = select(list.size());
        ArrayList arrayList = new ArrayList(q23.H(select, 10));
        for (juf juf : select) {
            arrayList.add(juf.a);
        }
        return o23.q0(arrayList).containsAll(o23.w0(list));
    }

    int count(int i);

    void delete(List<String> list);

    List<juf> getItemsForRunning(int i) {
        List<juf> select = select(i, 0);
        ArrayList arrayList = new ArrayList(q23.H(select, 10));
        for (juf juf : select) {
            arrayList.add(juf.a);
        }
        updateState(1, arrayList);
        return select;
    }

    void insert(juf juf) {
        if (ouf.$EnumSwitchMapping$0[juf.c.ordinal()] == 1) {
            insertOrIgnore(juf);
        } else {
            insertOrReplace(juf);
        }
    }

    void insertOrIgnore(juf juf);

    void insertOrReplace(juf juf);

    List<juf> select(int i);

    List<juf> select(int i, int i2);

    void updateState(int i, List<String> list);
}
