package defpackage;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: w  reason: default package */
public final class w implements bcf {
    public int a;
    public boolean b;
    public Object c;

    public void a() {
        this.b = true;
    }

    public void b() {
        w.super.setVisibility(0);
        this.b = false;
    }

    public void c() {
        if (!this.b) {
            ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
            actionBarContextView.x0 = null;
            w.super.setVisibility(this.a);
        }
    }
}
