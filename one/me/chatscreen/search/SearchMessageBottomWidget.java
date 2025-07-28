package one.me.chatscreen.search;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/chatscreen/search/SearchMessageBottomWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "(Ljava/lang/String;Lx54;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
public final class SearchMessageBottomWidget extends Widget {
    public static final /* synthetic */ k77[] w0;
    public final nl0 X;
    public boolean Y;
    public boolean Z;
    public final t97 a;
    public final nl0 b;
    public final nl0 c;
    public final nl0 o;

    static {
        Class<SearchMessageBottomWidget> cls = SearchMessageBottomWidget.class;
        w0 = new k77[]{new hc9(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;"), m4b.g(m7c.a, cls, "searchResultTextView", "getSearchResultTextView()Landroidx/appcompat/widget/AppCompatTextView;", 0), new khb(cls, "upButton", "getUpButton()Landroidx/appcompat/widget/AppCompatImageView;", 0), new khb(cls, "downButton", "getDownButton()Landroidx/appcompat/widget/AppCompatImageView;", 0), new khb(cls, "separatorView", "getSeparatorView()Landroid/view/View;", 0)};
    }

    public SearchMessageBottomWidget(String str, x54 x54) {
        this(jjd.j(new wia("arg_key_scope_id", new inc(str))));
    }

    public final AppCompatImageView l0() {
        k77 k77 = w0[3];
        return (AppCompatImageView) this.o.getValue();
    }

    public final AppCompatTextView m0() {
        k77 k77 = w0[1];
        return (AppCompatTextView) this.b.getValue();
    }

    public final View n0() {
        k77 k77 = w0[4];
        return (View) this.X.getValue();
    }

    public final AppCompatImageView o0() {
        k77 k77 = w0[2];
        return (AppCompatImageView) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        float f = (float) 12;
        float f2 = (float) 4;
        constraintLayout.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        constraintLayout.setMinHeight(a24.X(((float) 44) * dh4.c().getDisplayMetrics().density));
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        constraintLayout.addView(m0());
        constraintLayout.addView(o0());
        constraintLayout.addView(n0());
        constraintLayout.addView(l0());
        urd.B(new wua(this, (Continuation) null, 11, false), constraintLayout);
        bf3 p = a06.p(constraintLayout);
        int id = m0().getId();
        p.d(id, 6, 0, 6);
        p.d(id, 3, 0, 3);
        p.d(id, 7, o0().getId(), 6);
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(p, 7, id, 4));
        p.d(id, 4, 0, 4);
        p.g(id).d.l0 = true;
        p.g(id).d.w = 0.0f;
        int id2 = o0().getId();
        p.d(id2, 3, 0, 3);
        p.d(id2, 7, n0().getId(), 6);
        float f3 = (float) 10;
        hr1.q(f3, dh4.c().getDisplayMetrics().density, new hw9(p, 7, id2, 4));
        p.d(id2, 4, 0, 4);
        int id3 = n0().getId();
        p.d(id3, 3, 0, 3);
        p.d(id3, 7, l0().getId(), 6);
        hr1.q(f3, dh4.c().getDisplayMetrics().density, new hw9(p, 7, id3, 4));
        p.d(id3, 4, 0, 4);
        int id4 = l0().getId();
        p.d(id4, 3, 0, 3);
        p.d(id4, 7, 0, 7);
        p.d(id4, 4, 0, 4);
        p.a(constraintLayout);
        return constraintLayout;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rr3, one.me.chatscreen.search.SearchMessageBottomWidget] */
    public final void onDestroyView(View view) {
        SearchMessageBottomWidget.super.onDestroyView(view);
        p0().q();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [rr3, one.me.chatscreen.search.SearchMessageBottomWidget, one.me.sdk.arch.Widget] */
    public final void onViewCreated(View view) {
        SearchMessageBottomWidget.super.onViewCreated(view);
        ex9 h = getRouter().h();
        if (h != null) {
            h.b(p0().X);
        }
        ez3.N(new ck5(p0().Y, new crc(view, this, (Continuation) null), 5), getViewLifecycleScope());
        ez3.N(new ck5(new ik5(wx3.e(p0().w0, this.lifecycleOwner.R(), ob7.o), 2), new drc(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public final mrc p0() {
        return (mrc) this.a.getValue();
    }

    public final void q0(AppCompatImageView appCompatImageView, boolean z) {
        appCompatImageView.setImageTintList(ColorStateList.valueOf(z ? r0().b.a : r0().b.b));
    }

    public final avf r0() {
        return km4.y0.n(getContext()).g().a().d();
    }

    public SearchMessageBottomWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        jr jrVar = new jr(inc.class, "arg_key_scope_id");
        k77 k77 = w0[0];
        this.a = getSharedViewModel-cp94BC8(((inc) jrVar.a(this)).a, mrc.class, (s16) null);
        this.b = binding(new arc(this, 0));
        this.c = binding(new arc(this, 1));
        this.o = binding(new arc(this, 2));
        this.X = binding(new arc(this, 3));
    }
}
