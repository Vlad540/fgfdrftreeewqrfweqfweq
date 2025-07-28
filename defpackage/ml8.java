package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: ml8  reason: default package */
public final class ml8 extends BaseAdapter {
    public final LayoutInflater X;
    public final int Y;
    public final pl8 a;
    public int b = -1;
    public boolean c;
    public final boolean o;

    public ml8(pl8 pl8, LayoutInflater layoutInflater, boolean z, int i) {
        this.o = z;
        this.X = layoutInflater;
        this.a = pl8;
        this.Y = i;
        a();
    }

    public final void a() {
        pl8 pl8 = this.a;
        ul8 ul8 = pl8.K0;
        if (ul8 != null) {
            pl8.i();
            ArrayList arrayList = pl8.y0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((ul8) arrayList.get(i)) == ul8) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    /* renamed from: b */
    public final ul8 getItem(int i) {
        ArrayList arrayList;
        boolean z = this.o;
        pl8 pl8 = this.a;
        if (z) {
            pl8.i();
            arrayList = pl8.y0;
        } else {
            arrayList = pl8.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (ul8) arrayList.get(i);
    }

    public final int getCount() {
        ArrayList arrayList;
        boolean z = this.o;
        pl8 pl8 = this.a;
        if (z) {
            pl8.i();
            arrayList = pl8.y0;
        } else {
            arrayList = pl8.l();
        }
        return this.b < 0 ? arrayList.size() : arrayList.size() - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.X.inflate(this.Y, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        im8 im8 = (im8) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        im8.d(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
