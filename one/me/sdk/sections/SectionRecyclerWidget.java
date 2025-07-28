package one.me.sdk.sections;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/sdk/sections/SectionRecyclerWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "sections-widget_release"}, k = 1, mv = {2, 0, 0})
public abstract class SectionRecyclerWidget extends Widget {
    public static final /* synthetic */ k77[] c;
    public final n0c a = viewBinding(caa.o);
    public final u5g b = new u5g(25, this);

    static {
        k77 khb = new khb(SectionRecyclerWidget.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        m7c.a.getClass();
        c = new k77[]{khb};
    }

    public SectionRecyclerWidget() {
        super((Bundle) null, 0, 3, (x54) null);
    }

    public abstract i41 l0();

    public abstract g7d m0();

    public final RecyclerView n0(int i) {
        t93 t93 = new t93(new f6c[]{m0(), l0()});
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.setId(caa.o);
        recyclerView.setAdapter(t93);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        float f = (float) 12;
        recyclerView.setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), a24.X(f * dh4.c().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        pda r = km4.y0.r(recyclerView);
        u5g u5g = this.b;
        recyclerView.j(new qtc(r, u5g, (o8) null, 12));
        recyclerView.j(new jj4(u5g, i));
        return recyclerView;
    }
}
