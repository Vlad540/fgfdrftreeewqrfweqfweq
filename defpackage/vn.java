package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: vn  reason: default package */
public final class vn implements bo, DialogInterface.OnClickListener {
    public uc a;
    public ListAdapter b;
    public CharSequence c;
    public final /* synthetic */ co o;

    public vn(co coVar) {
        this.o = coVar;
    }

    public final boolean a() {
        uc ucVar = this.a;
        if (ucVar != null) {
            return ucVar.isShowing();
        }
        return false;
    }

    public final Drawable b() {
        return null;
    }

    public final int c() {
        return 0;
    }

    public final void d(int i) {
    }

    public final void dismiss() {
        uc ucVar = this.a;
        if (ucVar != null) {
            ucVar.dismiss();
            this.a = null;
        }
    }

    public final CharSequence f() {
        return this.c;
    }

    public final void h(CharSequence charSequence) {
        this.c = charSequence;
    }

    public final void i(Drawable drawable) {
    }

    public final void k(int i) {
    }

    public final void l(int i) {
    }

    public final void m(int i, int i2) {
        if (this.b != null) {
            co coVar = this.o;
            tc tcVar = new tc(coVar.getPopupContext());
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                tcVar.setTitle(charSequence);
            }
            ListAdapter listAdapter = this.b;
            int selectedItemPosition = coVar.getSelectedItemPosition();
            pc pcVar = tcVar.a;
            pcVar.q = listAdapter;
            pcVar.r = this;
            pcVar.u = selectedItemPosition;
            pcVar.t = true;
            uc create = tcVar.create();
            this.a = create;
            AlertController$RecycleListView alertController$RecycleListView = create.Y.g;
            alertController$RecycleListView.setTextDirection(i);
            alertController$RecycleListView.setTextAlignment(i2);
            this.a.show();
        }
    }

    public final int n() {
        return 0;
    }

    public final void o(ListAdapter listAdapter) {
        this.b = listAdapter;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        co coVar = this.o;
        coVar.setSelection(i);
        if (coVar.getOnItemClickListener() != null) {
            coVar.performItemClick((View) null, i, this.b.getItemId(i));
        }
        dismiss();
    }
}
