package one.me.calls.ui.view.mode.grid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lone/me/calls/ui/view/mode/grid/CallGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "o51", "og0", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class CallGridLayoutManager extends GridLayoutManager {
    public final Context M;
    public final int N;
    public final og0 O;
    public o51 P = new e3(this);

    public CallGridLayoutManager(Context context, int i, og0 og0) {
        super(2);
        this.M = context;
        this.N = i;
        this.O = og0;
    }

    public final void C1(fc6 fc6) {
        int h = this.P.h();
        og0 og0 = this.O;
        fc6.height = ((h - (og0.k() * this.N)) + 1) / og0.k();
    }

    public final boolean g(n6c n6c) {
        n6c s = s();
        return (n6c instanceof fc6) && s.width == n6c.width && s.height == n6c.height;
    }

    public final n6c s() {
        n6c s = super.s();
        C1((fc6) s);
        return s;
    }

    public final n6c t(Context context, AttributeSet attributeSet) {
        n6c t = super.t(context, attributeSet);
        C1((fc6) t);
        return t;
    }

    public final n6c u(ViewGroup.LayoutParams layoutParams) {
        n6c u = super.u(layoutParams);
        C1((fc6) u);
        return u;
    }
}
