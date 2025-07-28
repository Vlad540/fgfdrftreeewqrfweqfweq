package one.me.profile.screens.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/profile/screens/media/ChatMediaTabWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatMediaTabWidget extends Widget {
    public static final /* synthetic */ k77[] A0;
    public final nl0 X;
    public final nl0 Y;
    public final n0c Z;
    public final jj7 a;
    public final sy6 b;
    public final t97 c;
    public final t97 o;
    public final nl0 w0;
    public ur3 x0;
    public final mv4 y0;
    public final rd2 z0;

    static {
        Class<ChatMediaTabWidget> cls = ChatMediaTabWidget.class;
        k77 khb = new khb(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        n7c n7c = m7c.a;
        A0 = new k77[]{khb, wn6.e(n7c, cls, "mediaTabs", "getMediaTabs()Lone/me/common/tablayout/OneMeTabLayout;", 0), wn6.f(cls, "pinbarsContainer", "getPinbarsContainer()Landroid/view/ViewGroup;", 0, n7c), wn6.f(cls, "mediaViewPager", "getMediaViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0, n7c)};
    }

    public ChatMediaTabWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new jj7(new vz0(0, this, ChatMediaTabWidget.class, "getCurrentScreen", "getCurrentScreen()Lone/me/sdk/statistics/screen/Screen;", 0, 6), (s16) null, 6);
        this.b = sy6.d;
        this.c = i6b.a.getAccessor().d(xg9.class);
        this.o = createViewModelLazy(ee2.class, new s(26, new fe2(bundle, 0)));
        this.X = binding(new ge2(this, 0));
        this.Y = binding(new ge2(this, 1));
        this.Z = viewBinding(j8a.n0);
        this.w0 = binding(new ge2(this, 2));
        this.y0 = new mv4(8);
        this.z0 = new rd2(this, bundle.getLong("chat_id"));
    }

    public static final mnc l0(ChatMediaTabWidget chatMediaTabWidget) {
        chatMediaTabWidget.getClass();
        int ordinal = ((ie2) ie2.o.get(chatMediaTabWidget.m0().getCurrentItem())).ordinal();
        mnc mnc = mnc.CHAT_ATTACHMENTS_MEDIA;
        if (ordinal == 0) {
            return mnc;
        }
        if (ordinal == 1) {
            return mnc.CHAT_ATTACHMENTS_FILES;
        }
        if (ordinal == 2) {
            return mnc.CHAT_ATTACHMENTS_LINKS;
        }
        if (ordinal == 3) {
            return mnc;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final sy6 getInsetsConfig() {
        return this.b;
    }

    public final rnc getScreenDelegate() {
        return this.a;
    }

    public final ViewPager2 m0() {
        k77 k77 = A0[3];
        return (ViewPager2) this.w0.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setId(j8a.l0);
        linearLayout.setOrientation(1);
        k77[] k77Arr = A0;
        k77 k77 = k77Arr[0];
        linearLayout.addView((nea) this.X.getValue());
        k77 k772 = k77Arr[1];
        linearLayout.addView((hda) this.Y.getValue());
        az1 b2 = x87.b(linearLayout.getContext());
        b2.setId(j8a.n0);
        linearLayout.addView(b2);
        linearLayout.addView(m0());
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ur3 ur3 = this.x0;
        if (ur3 != null) {
            ur3.c();
        }
        this.x0 = null;
    }

    public final void onViewCreated(View view) {
        ViewPager2 m0 = m0();
        rd2 rd2 = this.z0;
        m0.setAdapter(rd2);
        k77[] k77Arr = A0;
        k77 k77 = k77Arr[1];
        hda hda = (hda) this.Y.getValue();
        ViewPager2 m02 = m0();
        mv4 mv4 = this.y0;
        mv4.getClass();
        ur3 ur3 = new ur3(hda, m02, new j9(hda, mv4));
        ur3.a();
        this.x0 = ur3;
        ez3.N(new ck5(wx3.e(new ik5(((ee2) this.o.getValue()).c, 2), getViewLifecycleOwner().R(), ob7.o), new he2((Continuation) null, this), 5), getViewLifecycleScope());
        ViewPager2 m03 = m0();
        RecyclerView childAt = m03.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator((k6c) null);
            recyclerView.setHasFixedSize(true);
        }
        m03.e(0, false);
        if (rd2.C0.size() > 0) {
            m03.measure(View.MeasureSpec.makeMeasureSpec(m03.getContext().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(m03.getContext().getResources().getDisplayMetrics().heightPixels, 1073741824));
        }
        sgc childRouter = getChildRouter((ViewGroup) this.Z.T0(this, k77Arr[2]));
        childRouter.e = 1;
        childRouter.Q(false);
        if (!childRouter.n()) {
            PinBarsWidget pinBarsWidget = new PinBarsWidget((Bundle) null, 1, (x54) null);
            pinBarsWidget.setRetainViewMode(getRetainViewMode());
            childRouter.R(n06.f(pinBarsWidget, (wr3) null, (wr3) null));
        }
    }

    public ChatMediaTabWidget(long j) {
        this(jjd.j(new wia[]{new wia("chat_id", Long.valueOf(j))}));
    }
}
