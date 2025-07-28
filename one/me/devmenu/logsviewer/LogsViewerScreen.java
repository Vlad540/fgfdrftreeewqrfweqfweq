package one.me.devmenu.logsviewer;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lone/me/devmenu/logsviewer/LogsViewerScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "li7", "tp7", "logsviewer_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class LogsViewerScreen extends Widget {
    public static final /* synthetic */ k77[] Y;
    public static final int Z = View.generateViewId();
    public final li7 X = new li7(l0().w0);
    public final sy6 a = sy6.d;
    public final nl0 b = binding(new gz3(27, this));
    public final t97 c = createViewModelLazy(kq7.class, new js5(12, new ib7(11)));
    public final li7 o = new li7(l0().Y);

    static {
        khb khb = new khb(LogsViewerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        m7c.a.getClass();
        Y = new k77[]{khb};
    }

    public LogsViewerScreen() {
        super((Bundle) null, 0, 3, (x54) null);
    }

    public final sy6 getInsetsConfig() {
        return this.a;
    }

    public final kq7 l0() {
        return (kq7) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        k77 k77 = Y[0];
        linearLayout.addView((nea) this.b.getValue(), new FrameLayout.LayoutParams(-1, -2));
        EditText editText = new EditText(linearLayout.getContext());
        editText.setSingleLine(true);
        nge.d(nte.k, editText);
        s59 s59 = km4.y0;
        editText.setTextColor(s59.r(editText).getText().e);
        editText.addTextChangedListener(new z2(2, this));
        linearLayout.addView(editText, new LinearLayout.LayoutParams(-1, -2));
        View view = new View(linearLayout.getContext());
        view.setBackgroundColor(s59.r(view).h().j);
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, a24.W(((double) dh4.c().getDisplayMetrics().density) * 0.5d)));
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(linearLayout.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.getContext();
        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        endlessRecyclerView2.setAdapter(this.o);
        endlessRecyclerView2.setThreshold(10);
        endlessRecyclerView2.j(new xj6(new ColorDrawable(-16777216)));
        endlessRecyclerView2.setPager(new t61(this, 3));
        ez3.N(new v11(l0().Y, l0().w0, new c3(endlessRecyclerView2, this, (Continuation) null, 15), 4), getViewLifecycleScope());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 112;
        linearLayout.addView(endlessRecyclerView2, layoutParams);
        return linearLayout;
    }
}
