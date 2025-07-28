package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

public class b {
    private static final int DEFAULT_MAX_SCRAP = 5;
    int mAttachCountForClearing = 0;
    Set<f6c> mAttachedAdaptersForPoolingContainer = Collections.newSetFromMap(new IdentityHashMap());
    SparseArray<s6c> mScrap = new SparseArray<>();

    public void attach() {
        this.mAttachCountForClearing++;
    }

    public void attachForPoolingContainer(f6c f6c) {
        this.mAttachedAdaptersForPoolingContainer.add(f6c);
    }

    public void clear() {
        for (int i = 0; i < this.mScrap.size(); i++) {
            s6c valueAt = this.mScrap.valueAt(i);
            Iterator it = valueAt.a.iterator();
            while (it.hasNext()) {
                l0b.a(((b7c) it.next()).a);
            }
            valueAt.a.clear();
        }
    }

    public void detach() {
        this.mAttachCountForClearing--;
    }

    public void detachForPoolingContainer(f6c f6c, boolean z) {
        this.mAttachedAdaptersForPoolingContainer.remove(f6c);
        if (this.mAttachedAdaptersForPoolingContainer.size() == 0 && !z) {
            for (int i = 0; i < this.mScrap.size(); i++) {
                SparseArray<s6c> sparseArray = this.mScrap;
                ArrayList arrayList = sparseArray.get(sparseArray.keyAt(i)).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    l0b.a(((b7c) arrayList.get(i2)).a);
                }
            }
        }
    }

    public void factorInBindTime(int i, long j) {
        s6c scrapDataForType = getScrapDataForType(i);
        scrapDataForType.d = runningAverage(scrapDataForType.d, j);
    }

    public void factorInCreateTime(int i, long j) {
        s6c scrapDataForType = getScrapDataForType(i);
        scrapDataForType.c = runningAverage(scrapDataForType.c, j);
    }

    public b7c getRecycledView(int i) {
        s6c s6c = this.mScrap.get(i);
        if (s6c == null) {
            return null;
        }
        ArrayList arrayList = s6c.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((b7c) arrayList.get(size)).l()) {
                return (b7c) arrayList.remove(size);
            }
        }
        return null;
    }

    public final s6c getScrapDataForType(int i) {
        s6c s6c = this.mScrap.get(i);
        if (s6c != null) {
            return s6c;
        }
        s6c s6c2 = new s6c();
        this.mScrap.put(i, s6c2);
        return s6c2;
    }

    public void onAdapterChanged(f6c f6c, f6c f6c2, boolean z) {
        if (f6c != null) {
            detach();
        }
        if (!z && this.mAttachCountForClearing == 0) {
            clear();
        }
        if (f6c2 != null) {
            attach();
        }
    }

    public void putRecycledView(b7c b7c) {
        int i = b7c.Y;
        ArrayList arrayList = getScrapDataForType(i).a;
        if (this.mScrap.get(i).b <= arrayList.size()) {
            l0b.a(b7c.a);
        } else if (!RecyclerView.P1 || !arrayList.contains(b7c)) {
            b7c.u();
            arrayList.add(b7c);
        } else {
            throw new IllegalArgumentException("this scrap item already exists");
        }
    }

    public long runningAverage(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        return (j2 / 4) + ((j / 4) * 3);
    }

    public void setMaxRecycledViews(int i, int i2) {
        s6c scrapDataForType = getScrapDataForType(i);
        scrapDataForType.b = i2;
        ArrayList arrayList = scrapDataForType.a;
        while (arrayList.size() > i2) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public int size() {
        int i = 0;
        for (int i2 = 0; i2 < this.mScrap.size(); i2++) {
            ArrayList arrayList = this.mScrap.valueAt(i2).a;
            if (arrayList != null) {
                i = arrayList.size() + i;
            }
        }
        return i;
    }

    public boolean willBindInTime(int i, long j, long j2) {
        long j3 = getScrapDataForType(i).d;
        return j3 == 0 || j + j3 < j2;
    }

    public boolean willCreateInTime(int i, long j, long j2) {
        long j3 = getScrapDataForType(i).c;
        return j3 == 0 || j + j3 < j2;
    }
}
