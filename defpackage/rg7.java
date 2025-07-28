package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* renamed from: rg7  reason: default package */
public final class rg7 implements hm8, AdapterView.OnItemClickListener {
    public final int X;
    public gm8 Y;
    public qg7 Z;
    public Context a;
    public LayoutInflater b;
    public pl8 c;
    public ExpandedMenuView o;

    public rg7(Context context, int i) {
        this.X = i;
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, gm8, android.content.DialogInterface$OnKeyListener, java.lang.Object, ql8, android.content.DialogInterface$OnDismissListener] */
    public final boolean b(w0e w0e) {
        if (!w0e.hasVisibleItems()) {
            return false;
        }
        ? obj = new Object();
        obj.a = w0e;
        Context context = w0e.a;
        tc tcVar = new tc(context);
        rg7 rg7 = new rg7(tcVar.getContext(), asb.abc_list_menu_item_layout);
        obj.c = rg7;
        rg7.Y = obj;
        w0e.b(rg7, context);
        rg7 rg72 = obj.c;
        if (rg72.Z == null) {
            rg72.Z = new qg7(rg72);
        }
        qg7 qg7 = rg72.Z;
        pc pcVar = tcVar.a;
        pcVar.q = qg7;
        pcVar.r = obj;
        View view = w0e.D0;
        if (view != null) {
            pcVar.e = view;
        } else {
            pcVar.c = w0e.C0;
            tcVar.setTitle(w0e.B0);
        }
        pcVar.o = obj;
        uc create = tcVar.create();
        obj.b = create;
        create.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.b.show();
        gm8 gm8 = this.Y;
        if (gm8 == null) {
            return true;
        }
        gm8.x(w0e);
        return true;
    }

    public final boolean c() {
        return false;
    }

    public final boolean d(ul8 ul8) {
        return false;
    }

    public final void e(gm8 gm8) {
        this.Y = gm8;
    }

    public final void f(pl8 pl8, boolean z) {
        gm8 gm8 = this.Y;
        if (gm8 != null) {
            gm8.f(pl8, z);
        }
    }

    public final boolean h(ul8 ul8) {
        return false;
    }

    public final void i() {
        qg7 qg7 = this.Z;
        if (qg7 != null) {
            qg7.notifyDataSetChanged();
        }
    }

    public final void k(Context context, pl8 pl8) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = pl8;
        qg7 qg7 = this.Z;
        if (qg7 != null) {
            qg7.notifyDataSetChanged();
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.Z.getItem(i), this, 0);
    }
}
