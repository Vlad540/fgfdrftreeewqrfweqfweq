package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: xn  reason: default package */
public final class xn implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xn(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object obj;
        switch (this.a) {
            case 0:
                zn znVar = (zn) this.b;
                znVar.T0.setSelection(i);
                if (znVar.T0.getOnItemClickListener() != null) {
                    znVar.T0.performItemClick(view, i, znVar.Q0.getItemId(i));
                }
                znVar.dismiss();
                return;
            case 1:
                View view2 = null;
                qv7 qv7 = (qv7) this.b;
                if (i < 0) {
                    xg7 xg7 = qv7.w0;
                    obj = !xg7.O0.isShowing() ? null : xg7.c.getSelectedItem();
                } else {
                    obj = qv7.getAdapter().getItem(i);
                }
                qv7.b(qv7, obj);
                AdapterView.OnItemClickListener onItemClickListener = qv7.getOnItemClickListener();
                xg7 xg72 = qv7.w0;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        if (xg72.O0.isShowing()) {
                            view2 = xg72.c.getSelectedView();
                        }
                        view = view2;
                        i = !xg72.O0.isShowing() ? -1 : xg72.c.getSelectedItemPosition();
                        j = !xg72.O0.isShowing() ? Long.MIN_VALUE : xg72.c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(xg72.c, view, i, j);
                }
                xg72.dismiss();
                return;
            default:
                ((tsc) this.b).onItemClicked(i, 0, (String) null);
                return;
        }
    }
}
