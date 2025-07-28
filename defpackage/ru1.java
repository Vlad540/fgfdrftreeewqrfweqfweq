package defpackage;

import android.view.View;

/* renamed from: ru1  reason: default package */
public final class ru1 {
    public float a;
    public float b;
    public Object c;

    public void a() {
        View view = (View) this.c;
        view.setPivotX(this.a * ((float) view.getMeasuredWidth()));
        view.setPivotY(this.b * ((float) view.getMeasuredHeight()));
    }
}
