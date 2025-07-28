package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: dx3  reason: default package */
public abstract class dx3 extends BaseAdapter implements Filterable, ex3 {
    public bx3 X;
    public cx3 Y;
    public fx3 Z;
    public boolean a;
    public boolean b;
    public Cursor c;
    public int o;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                bx3 bx3 = this.X;
                if (bx3 != null) {
                    cursor2.unregisterContentObserver(bx3);
                }
                cx3 cx3 = this.Y;
                if (cx3 != null) {
                    cursor2.unregisterDataSetObserver(cx3);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                bx3 bx32 = this.X;
                if (bx32 != null) {
                    cursor.registerContentObserver(bx32);
                }
                cx3 cx32 = this.Y;
                if (cx32 != null) {
                    cursor.registerDataSetObserver(cx32);
                }
                this.o = cursor.getColumnIndexOrThrow("_id");
                this.a = true;
                notifyDataSetChanged();
            } else {
                this.o = -1;
                this.a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    public final int getCount() {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.c.moveToPosition(i);
        if (view == null) {
            w2e w2e = (w2e) this;
            view = w2e.y0.inflate(w2e.x0, viewGroup, false);
        }
        a(view, this.c);
        return view;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [fx3, android.widget.Filter] */
    public final Filter getFilter() {
        if (this.Z == null) {
            ? filter = new Filter();
            filter.a = this;
            this.Z = filter;
        }
        return this.Z;
    }

    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.c;
    }

    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.c.getLong(this.o);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.c.moveToPosition(i)) {
            if (view == null) {
                view = d(viewGroup);
            }
            a(view, this.c);
            return view;
        } else {
            throw new IllegalStateException(wn6.h(i, "couldn't move cursor to position "));
        }
    }
}
