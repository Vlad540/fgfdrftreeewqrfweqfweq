package one.me.android.deeplink;

import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001f\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/android/deeplink/LinkInterceptorWidget;", "Lone/me/sdk/arch/Widget;", "Llc3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Landroid/net/Uri;", "uri", "Lne7;", "result", "(Landroid/net/Uri;Lne7;)V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
public final class LinkInterceptorWidget extends Widget implements lc3 {
    public static final /* synthetic */ int o = 0;
    public final t97 a;
    public final t97 b;
    public final boolean c;

    public LinkInterceptorWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = createViewModelLazy(ff7.class, new js5(10, new ib7(2)));
        this.b = ez3.O(3, new gf7(this, 0));
        this.c = true;
    }

    public final void i(int i, Bundle bundle) {
        ((we1) this.b.getValue()).g(i);
    }

    public final boolean isDialog() {
        return this.c;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(viewGroup.getContext(), (AttributeSet) null);
        coordinatorLayout.setId(nob.link_interceptor_widget_view);
        coordinatorLayout.setBackgroundColor(0);
        return coordinatorLayout;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rr3, one.me.android.deeplink.LinkInterceptorWidget] */
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        LinkInterceptorWidget.super.onRequestPermissionsResult(i, strArr, iArr);
        ((we1) this.b.getValue()).b(i, strArr, iArr);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [rr3, one.me.android.deeplink.LinkInterceptorWidget, one.me.sdk.arch.Widget, java.lang.Object] */
    public final void onViewCreated(View view) {
        ex9 onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            nc7 viewLifecycleOwner = getViewLifecycleOwner();
            or3 or3 = new or3(true, (u16) new gw2(23, this));
            if (viewLifecycleOwner != null) {
                onBackPressedDispatcher.a(viewLifecycleOwner, or3);
            } else {
                onBackPressedDispatcher.b(or3);
            }
        }
        ff7 ff7 = (ff7) this.a.getValue();
        Uri uri = (Uri) getArgs().getParcelable("uri");
        ne7 parcelable = getArgs().getParcelable("link_result");
        ff7.getClass();
        ez3.N(new ck5(ez3.h0(parcelable != null ? new tj5(3, parcelable) : uri == null ? new tj5(3, xd7.a) : ((ef7) ff7.b.getValue()).e(uri), new ox2(3, (Continuation) null, 4)), new if7(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public LinkInterceptorWidget(Uri uri, ne7 ne7) {
        this(jjd.j(new wia("uri", uri), new wia("link_result", ne7)));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LinkInterceptorWidget(Uri uri, ne7 ne7, int i, x54 x54) {
        this(uri, (i & 2) != 0 ? null : ne7);
    }
}
