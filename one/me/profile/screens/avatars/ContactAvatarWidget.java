package one.me.profile.screens.avatars;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.zoom.ZoomableDraweeView;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0004\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\u000e¨\u0006\u0010"}, d2 = {"Lone/me/profile/screens/avatars/ContactAvatarWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "", "", "urls", "(JLjava/util/List;)V", "Lbg3;", "model", "(Lbg3;)V", "dg3", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ContactAvatarWidget extends Widget {
    public static final /* synthetic */ k77[] X;
    public final qda a;
    public final jr b;
    public final jr c;
    public final n0c o;

    static {
        Class<ContactAvatarWidget> cls = ContactAvatarWidget.class;
        k77 khb = new khb(cls, "imageId", "getImageId()J", 0);
        n7c n7c = m7c.a;
        X = new k77[]{khb, wn6.e(n7c, cls, "imageUrls", "getImageUrls()Ljava/util/List;", 0), wn6.f(cls, "imageView", "getImageView()Lone/me/sdk/zoom/ZoomableDraweeView;", 0, n7c)};
    }

    public ContactAvatarWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = qda.a;
        this.b = new jr(Long.class, 0L, "extra.id");
        this.c = new jr(List.class, hw4.a, "extra.urls");
        this.o = viewBinding(spb.profile_contact_avatars_image_view);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [one.me.sdk.zoom.ZoomableDraweeView, android.widget.ImageView, android.view.View] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        int i = spb.profile_contact_avatars_image_view;
        ? zoomableDraweeView = new ZoomableDraweeView(frameLayout.getContext());
        zoomableDraweeView.setId(i);
        zoomableDraweeView.setAdjustViewBounds(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        zoomableDraweeView.setLayoutParams(layoutParams);
        frameLayout.addView(zoomableDraweeView);
        return frameLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        dg3 parentController = getParentController();
        dg3 dg3 = parentController instanceof dg3 ? parentController : null;
        k77[] k77Arr = X;
        on4 on4 = (ZoomableDraweeView) this.o.T0(this, k77Arr[2]);
        this.a.getClass();
        z66 z66 = new z66(on4.getResources());
        z66.l = jlc.j;
        z66.j = new u10(on4.getContext(), 0);
        Context context = on4.getContext();
        int i = zhc.v;
        z66.f = js.q(i, -855638017, context);
        z66.h = js.q(i, -855638017, on4.getContext());
        z66.b = 0;
        on4.setHierarchy(z66.a());
        on4.setZoomEnabled(true);
        on4.setOnTouchListener(new cg3(new GestureDetector(on4.getContext(), new g33(dg3, 1, this)), 0));
        k77 k77 = k77Arr[1];
        List<String> list = (List) this.c.a(this);
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        for (String str : list) {
            tr6 b2 = tr6.b(str);
            if (b2 != null) {
                fr6 u = a06.u();
                u.getClass();
                arrayList.add(new er6(u, b2, str));
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        ywa a2 = a06.a.a();
        a2.g = new nv6(arrayList, false);
        a2.i = true;
        a2.l = on4.getController();
        on4.setController(a2.a());
    }

    public ContactAvatarWidget(long j, List<String> list) {
        this(jjd.j(new wia[]{new wia("extra.id", Long.valueOf(j)), new wia("extra.urls", list)}));
    }

    public ContactAvatarWidget(bg3 bg3) {
        this(bg3.a, bg3.b);
    }
}
