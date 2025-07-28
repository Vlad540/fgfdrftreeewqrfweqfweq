package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* renamed from: w3e  reason: default package */
public final class w3e extends ActionMode {
    public final Context a;
    public final n7 b;

    public w3e(Context context, n7 n7Var) {
        this.a = context;
        this.b = n7Var;
    }

    public final void finish() {
        this.b.a();
    }

    public final View getCustomView() {
        return this.b.b();
    }

    public final Menu getMenu() {
        return new km8(this.a, this.b.c());
    }

    public final MenuInflater getMenuInflater() {
        return this.b.e();
    }

    public final CharSequence getSubtitle() {
        return this.b.f();
    }

    public final Object getTag() {
        return this.b.b;
    }

    public final CharSequence getTitle() {
        return this.b.g();
    }

    public final boolean getTitleOptionalHint() {
        return this.b.a;
    }

    public final void invalidate() {
        this.b.h();
    }

    public final boolean isTitleOptional() {
        return this.b.i();
    }

    public final void setCustomView(View view) {
        this.b.j(view);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.b.l(charSequence);
    }

    public final void setTag(Object obj) {
        this.b.b = obj;
    }

    public final void setTitle(CharSequence charSequence) {
        this.b.n(charSequence);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.b.o(z);
    }

    public final void setSubtitle(int i) {
        this.b.k(i);
    }

    public final void setTitle(int i) {
        this.b.m(i);
    }
}
