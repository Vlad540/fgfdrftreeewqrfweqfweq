package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: tc  reason: default package */
public class tc {
    public final pc a;
    public final int b;

    public tc(Context context) {
        this(context, uc.g(context, 0));
    }

    public final uc a() {
        uc create = create();
        create.show();
        return create;
    }

    public uc create() {
        pc pcVar = this.a;
        uc ucVar = new uc(pcVar.a, this.b);
        View view = pcVar.e;
        sc scVar = ucVar.Y;
        if (view != null) {
            scVar.C = view;
        } else {
            CharSequence charSequence = pcVar.d;
            if (charSequence != null) {
                scVar.e = charSequence;
                TextView textView = scVar.A;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = pcVar.c;
            if (drawable != null) {
                scVar.y = drawable;
                scVar.x = 0;
                ImageView imageView = scVar.z;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    scVar.z.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = pcVar.f;
        if (charSequence2 != null) {
            scVar.f = charSequence2;
            TextView textView2 = scVar.B;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = pcVar.g;
        if (charSequence3 != null) {
            scVar.c(-1, charSequence3, pcVar.h);
        }
        CharSequence charSequence4 = pcVar.i;
        if (charSequence4 != null) {
            scVar.c(-2, charSequence4, pcVar.j);
        }
        CharSequence charSequence5 = pcVar.k;
        if (charSequence5 != null) {
            scVar.c(-3, charSequence5, pcVar.l);
        }
        if (!(pcVar.p == null && pcVar.q == null)) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) pcVar.b.inflate(scVar.G, (ViewGroup) null);
            int i = pcVar.t ? scVar.H : scVar.I;
            ListAdapter listAdapter = pcVar.q;
            if (listAdapter == null) {
                listAdapter = new ArrayAdapter(pcVar.a, i, 16908308, pcVar.p);
            }
            scVar.D = listAdapter;
            scVar.E = pcVar.u;
            if (pcVar.r != null) {
                alertController$RecycleListView.setOnItemClickListener(new oc(pcVar, scVar));
            }
            if (pcVar.t) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            scVar.g = alertController$RecycleListView;
        }
        View view2 = pcVar.s;
        if (view2 != null) {
            scVar.h = view2;
            scVar.i = 0;
            scVar.j = false;
        }
        ucVar.setCancelable(pcVar.m);
        if (pcVar.m) {
            ucVar.setCanceledOnTouchOutside(true);
        }
        ucVar.setOnCancelListener((DialogInterface.OnCancelListener) null);
        ucVar.setOnDismissListener(pcVar.n);
        DialogInterface.OnKeyListener onKeyListener = pcVar.o;
        if (onKeyListener != null) {
            ucVar.setOnKeyListener(onKeyListener);
        }
        return ucVar;
    }

    public Context getContext() {
        return this.a.a;
    }

    public tc setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        pc pcVar = this.a;
        pcVar.i = pcVar.a.getText(i);
        pcVar.j = onClickListener;
        return this;
    }

    public tc setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        pc pcVar = this.a;
        pcVar.g = pcVar.a.getText(i);
        pcVar.h = onClickListener;
        return this;
    }

    public tc setTitle(CharSequence charSequence) {
        this.a.d = charSequence;
        return this;
    }

    public tc setView(View view) {
        this.a.s = view;
        return this;
    }

    public tc(Context context, int i) {
        this.a = new pc(new ContextThemeWrapper(context, uc.g(context, i)));
        this.b = i;
    }
}
