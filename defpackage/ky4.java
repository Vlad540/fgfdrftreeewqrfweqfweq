package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* renamed from: ky4  reason: default package */
public final /* synthetic */ class ky4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ly4 c;
    public final /* synthetic */ ty4 o;

    public /* synthetic */ ky4(int i, int i2, ly4 ly4, ty4 ty4) {
        this.a = i;
        this.b = i2;
        this.c = ly4;
        this.o = ty4;
    }

    public final void run() {
        int i;
        ly4 ly4 = this.c;
        ny4 ny4 = (ny4) ly4.c;
        if (!(this.a == 0 && this.b == 0)) {
            ny4.getClass();
        }
        ty4 ty4 = this.o;
        StaggeredGridLayoutManager layoutManager = ty4.getLayoutManager();
        int i2 = 0;
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = layoutManager;
            int i3 = staggeredGridLayoutManager.p;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < staggeredGridLayoutManager.p; i4++) {
                lod lod = staggeredGridLayoutManager.q[i4];
                boolean z = ((StaggeredGridLayoutManager) lod.f).w;
                ArrayList arrayList = (ArrayList) lod.e;
                iArr[i4] = z ? lod.g(0, arrayList.size(), true, false) : lod.g(arrayList.size() - 1, -1, true, false);
            }
            i = iArr[i3 - 1];
        } else {
            i = layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).Y0() : 0;
        }
        f6c adapter = ty4.getAdapter();
        if (adapter != null) {
            if (adapter.j() - i <= ly4.b && ((ty4.getIgnoreRefreshingFlagsForScrollEvent() || !ty4.h2) && ny4.m())) {
                if (ty4.k2 != null) {
                    ty4.getRefreshingNextDelegate();
                    ty4.setRefreshingNext(true);
                }
                ny4.l();
            }
            StaggeredGridLayoutManager layoutManager2 = ty4.getLayoutManager();
            if (layoutManager2 instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = layoutManager2;
                int i5 = staggeredGridLayoutManager2.p;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < staggeredGridLayoutManager2.p; i6++) {
                    lod lod2 = staggeredGridLayoutManager2.q[i6];
                    boolean z2 = ((StaggeredGridLayoutManager) lod2.f).w;
                    ArrayList arrayList2 = (ArrayList) lod2.e;
                    iArr2[i6] = z2 ? lod2.g(arrayList2.size() - 1, -1, true, false) : lod2.g(0, arrayList2.size(), true, false);
                }
                i2 = iArr2[i5 - 1];
            } else if (layoutManager2 instanceof LinearLayoutManager) {
                i2 = ((LinearLayoutManager) layoutManager2).W0();
            }
            if (i2 >= 0 && i2 <= ly4.b) {
                if ((ty4.getIgnoreRefreshingFlagsForScrollEvent() || !ty4.i2) && ny4.c()) {
                    if (ty4.k2 != null) {
                        ty4.setRefreshingPrev(true);
                    }
                    ny4.i();
                }
            }
        }
    }
}
