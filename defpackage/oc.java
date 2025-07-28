package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: oc  reason: default package */
public final class oc implements AdapterView.OnItemClickListener {
    public final /* synthetic */ sc a;
    public final /* synthetic */ pc b;

    public oc(pc pcVar, sc scVar) {
        this.b = pcVar;
        this.a = scVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        pc pcVar = this.b;
        DialogInterface.OnClickListener onClickListener = pcVar.r;
        sc scVar = this.a;
        onClickListener.onClick(scVar.b, i);
        if (!pcVar.t) {
            scVar.b.dismiss();
        }
    }
}
