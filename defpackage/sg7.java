package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: sg7  reason: default package */
public final class sg7 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sg7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        yo4 yo4;
        switch (this.a) {
            case 0:
                if (i != -1 && (yo4 = ((xg7) this.b).c) != null) {
                    yo4.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((tsc) this.b).onItemSelected(i);
                return;
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.a;
    }
}
