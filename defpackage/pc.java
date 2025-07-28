package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* renamed from: pc  reason: default package */
public final class pc {
    public final Context a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public CharSequence f;
    public CharSequence g;
    public DialogInterface.OnClickListener h;
    public CharSequence i;
    public DialogInterface.OnClickListener j;
    public CharSequence k;
    public DialogInterface.OnClickListener l;
    public boolean m;
    public DialogInterface.OnDismissListener n;
    public DialogInterface.OnKeyListener o;
    public CharSequence[] p;
    public ListAdapter q;
    public DialogInterface.OnClickListener r;
    public View s;
    public boolean t;
    public int u = -1;

    public pc(ContextThemeWrapper contextThemeWrapper) {
        this.a = contextThemeWrapper;
        this.m = true;
        this.b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
