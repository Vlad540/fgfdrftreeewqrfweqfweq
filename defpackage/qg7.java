package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: qg7  reason: default package */
public final class qg7 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ rg7 b;

    public qg7(rg7 rg7) {
        this.b = rg7;
        a();
    }

    public final void a() {
        pl8 pl8 = this.b.c;
        ul8 ul8 = pl8.K0;
        if (ul8 != null) {
            pl8.i();
            ArrayList arrayList = pl8.y0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((ul8) arrayList.get(i)) == ul8) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    /* renamed from: b */
    public final ul8 getItem(int i) {
        rg7 rg7 = this.b;
        pl8 pl8 = rg7.c;
        pl8.i();
        ArrayList arrayList = pl8.y0;
        rg7.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (ul8) arrayList.get(i);
    }

    public final int getCount() {
        rg7 rg7 = this.b;
        pl8 pl8 = rg7.c;
        pl8.i();
        int size = pl8.y0.size();
        rg7.getClass();
        return this.a < 0 ? size : size - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            rg7 rg7 = this.b;
            view = rg7.b.inflate(rg7.X, viewGroup, false);
        }
        ((im8) view).d(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
