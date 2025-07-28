package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: j08  reason: default package */
public final /* synthetic */ class j08 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarWidget b;

    public /* synthetic */ j08(MediaBarWidget mediaBarWidget, int i) {
        this.a = i;
        this.b = mediaBarWidget;
    }

    public final Object invoke() {
        ob7 ob7 = ob7.o;
        jue jue = jue.a;
        boolean z = true;
        SelectAlbumWidget selectAlbumWidget = null;
        MediaBarWidget mediaBarWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = MediaBarWidget.h1;
                FrameLayout frameLayout = new FrameLayout(mediaBarWidget.getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a24.X(((float) 36) * dh4.c().getDisplayMetrics().density), a24.X(((float) 5) * dh4.c().getDisplayMetrics().density));
                layoutParams.gravity = 17;
                frameLayout.setLayoutParams(layoutParams);
                frameLayout.setOutlineProvider(new eu3(dh4.c().getDisplayMetrics().density * 40.0f));
                frameLayout.setBackgroundColor(km4.y0.r(frameLayout).getIcon().g);
                return frameLayout;
            case 1:
                k77[] k77Arr2 = MediaBarWidget.h1;
                FrameLayout frameLayout2 = new FrameLayout(mediaBarWidget.getContext());
                frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, a24.X(((float) 10) * dh4.c().getDisplayMetrics().density)));
                float f = (float) 4;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), a24.X(dh4.c().getDisplayMetrics().density * f), frameLayout2.getPaddingRight(), a24.X(f * dh4.c().getDisplayMetrics().density));
                k77 k77 = MediaBarWidget.h1[4];
                frameLayout2.addView((FrameLayout) mediaBarWidget.z0.getValue());
                return frameLayout2;
            case 2:
                k77[] k77Arr3 = MediaBarWidget.h1;
                nea nea = new nea(mediaBarWidget.getContext(), 6);
                nea.setId(yob.media_bar__album_chooser);
                nea.setTitle(ktb.media_bar_recent);
                nea.setLeftActions(new wda(new l08(mediaBarWidget, 2)));
                nea.setTitleClickListener(new j08(mediaBarWidget, 13));
                return nea;
            case 3:
                k77[] k77Arr4 = MediaBarWidget.h1;
                FrameLayout frameLayout3 = new FrameLayout(mediaBarWidget.getContext());
                frameLayout3.setId(yob.media_bar__primary_container);
                frameLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                return frameLayout3;
            case 4:
                k77[] k77Arr5 = MediaBarWidget.h1;
                FrameLayout frameLayout4 = new FrameLayout(mediaBarWidget.getContext());
                frameLayout4.setId(yob.media_bar__partial_media_access_container);
                frameLayout4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                return frameLayout4;
            case 5:
                k77[] k77Arr6 = MediaBarWidget.h1;
                lt1 lt1 = new lt1(mediaBarWidget.getContext());
                lt1.setListener(mediaBarWidget);
                ykb ykb = (ykb) mediaBarWidget.D0.getValue();
                ExecutorService c = ((x4a) sl2.a.getAccessor().c(x4a.class)).c();
                if (lt1.a == null) {
                    z = false;
                }
                if (!z) {
                    vkb vkb = new vkb(lt1.getContext());
                    vkb.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    lt1.a = vkb;
                    e3 e3Var = new e3(lt1);
                    vkb.o = ykb;
                    vkb.x0 = e3Var;
                    vkb.w0 = c;
                    vkb.getCameraApi().setCameraListener(new gvf(23, (Object) vkb));
                    ez3.N(new ck5(wx3.e(ykb.z0, paf.a(vkb).R(), ob7), new skb((Continuation) null, vkb), 5), xs7.A(paf.a(vkb)));
                    ez3.N(new ck5(wx3.e(ykb.y0, paf.a(vkb).R(), ob7), new tkb((Continuation) null, vkb), 5), xs7.A(paf.a(vkb)));
                    ez3.N(new ck5(wx3.e(ykb.x0, paf.a(vkb).R(), ob7), new ukb((Continuation) null, vkb), 5), xs7.A(paf.a(vkb)));
                    View view = lt1.a;
                    if (view == null) {
                        view = null;
                    }
                    lt1.addView(view);
                    vkb vkb2 = lt1.a;
                    if (vkb2 == null) {
                        vkb2 = null;
                    }
                    vkb2.getCameraApi().e();
                    a24.Z(lt1, 300, new d5(14, lt1));
                }
                ez3.N(new ck5(wx3.e(mediaBarWidget.A0().G0, mediaBarWidget.getViewLifecycleOwner().R(), ob7), new n08((Continuation) null, lt1), 5), mediaBarWidget.getViewLifecycleScope());
                lt1.setForeground(mediaBarWidget.G0);
                return lt1;
            case 6:
                k77[] k77Arr7 = MediaBarWidget.h1;
                uwc uwc = new uwc(mediaBarWidget.A0());
                ez3.N(new ck5(wx3.e(mediaBarWidget.A0().B0, mediaBarWidget.getViewLifecycleOwner().R(), ob7), new b18((Continuation) null, uwc), 5), mediaBarWidget.getViewLifecycleScope());
                return uwc;
            case 7:
                k77[] k77Arr8 = MediaBarWidget.h1;
                RecyclerView recyclerView = new RecyclerView(mediaBarWidget.getContext(), (AttributeSet) null);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                float f2 = (float) 4;
                layoutParams2.setMargins(layoutParams2.leftMargin, a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(((float) 6) * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density));
                recyclerView.setLayoutParams(layoutParams2);
                SelectAlbumWidget itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator instanceof w84) {
                    selectAlbumWidget = (w84) itemAnimator;
                }
                if (selectAlbumWidget != null) {
                    selectAlbumWidget.g = false;
                }
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(dh4.c().getDisplayMetrics().density * 12.0f);
                recyclerView.setBackground(gradientDrawable);
                recyclerView.setClipToOutline(true);
                k77 k772 = MediaBarWidget.h1[11];
                ((uwc) mediaBarWidget.L0.getValue()).Y = new ck3(recyclerView, 1, mediaBarWidget);
                recyclerView.getContext();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                linearLayoutManager.o1(0);
                recyclerView.setLayoutManager(linearLayoutManager);
                return recyclerView;
            case 8:
                k77[] k77Arr9 = MediaBarWidget.h1;
                LinearLayout linearLayout = new LinearLayout(mediaBarWidget.getContext());
                linearLayout.setVerticalGravity(16);
                OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
                oneMeButton.setMode(u0a.b);
                oneMeButton.setAppearance(s0a.c);
                oneMeButton.setEndIcon(Integer.valueOf(i2a.f));
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                float f3 = (float) 8;
                layoutParams3.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f3), layoutParams3.topMargin, a24.X(f3 * dh4.c().getDisplayMetrics().density), layoutParams3.bottomMargin);
                oneMeButton.setLayoutParams(layoutParams3);
                a24.Z(oneMeButton, 300, new eu5(11, mediaBarWidget));
                linearLayout.addView(oneMeButton);
                k77 k773 = MediaBarWidget.h1[12];
                linearLayout.addView((RecyclerView) mediaBarWidget.M0.getValue());
                ez3.N(new ck5(wx3.e(mediaBarWidget.A0().I0, mediaBarWidget.getViewLifecycleOwner().R(), ob7), new c18((Continuation) null, linearLayout, mediaBarWidget), 5), mediaBarWidget.getViewLifecycleScope());
                return linearLayout;
            case 9:
                k77[] k77Arr10 = MediaBarWidget.h1;
                jq8 jq8 = new jq8(mediaBarWidget.getContext());
                jq8.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                jq8.setVisibility(8);
                jq8.setRightOuterIconActionState(cq8.a);
                jq8.setInputHint(k2a.J);
                jq8.c.addTextChangedListener(new ae1(new l08(mediaBarWidget, 1), 7, jq8));
                jq8.setRightOuterIconTouchListener(xie.a(jq8.getContext(), new j08(mediaBarWidget, 10)));
                jq8.setLeftInnerIconTouchListener(xie.a(jq8.getContext(), new j08(mediaBarWidget, 11)));
                return jq8;
            case 10:
                k77[] k77Arr11 = MediaBarWidget.h1;
                i08 A0 = mediaBarWidget.A0();
                k77[] k77Arr12 = i08.M0;
                A0.t(false);
                return jue;
            case 11:
                k77[] k77Arr13 = MediaBarWidget.h1;
                i08 A02 = mediaBarWidget.A0();
                k77[] k77Arr14 = i08.M0;
                A02.z0.K(0);
                return jue;
            case 12:
                k77[] k77Arr15 = MediaBarWidget.h1;
                return Boolean.valueOf(mediaBarWidget.A0().s());
            case 13:
                k77[] k77Arr16 = MediaBarWidget.h1;
                if (mediaBarWidget.w0().getScrollState() == x0b.c) {
                    mediaBarWidget.y0().setVisibility(0);
                    k77[] k77Arr17 = MediaBarWidget.h1;
                    k77 k774 = k77Arr17[18];
                    n0c n0c = mediaBarWidget.Z0;
                    ax2 ax2 = (ax2) n0c.T0(mediaBarWidget, k774);
                    if (!hhd.f(ax2.b(), "select_album_widget")) {
                        vgc vgc = new vgc(new SelectAlbumWidget(mediaBarWidget.a, (x54) null), (String) null, (wr3) null, (wr3) null, false, -1);
                        vgc.d("select_album_widget");
                        ax2.a.R(vgc);
                    }
                    SelectAlbumWidget a2 = ((ax2) n0c.T0(mediaBarWidget, k77Arr17[18])).a();
                    if (a2 instanceof SelectAlbumWidget) {
                        selectAlbumWidget = a2;
                    }
                    if (selectAlbumWidget != null) {
                        selectAlbumWidget.o0();
                    }
                }
                return jue;
            case 14:
                k77[] k77Arr18 = MediaBarWidget.h1;
                LinearLayout linearLayout2 = new LinearLayout(mediaBarWidget.getContext());
                linearLayout2.setId(yob.media_bar__draggable_container);
                linearLayout2.setOrientation(1);
                linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                linearLayout2.setOutlineProvider(mediaBarWidget.P0);
                linearLayout2.setForeground(mediaBarWidget.Q0);
                urd.B(new jc1(3, (Continuation) null, 1), linearLayout2);
                k77[] k77Arr19 = MediaBarWidget.h1;
                k77 k775 = k77Arr19[5];
                linearLayout2.addView((FrameLayout) mediaBarWidget.A0.getValue());
                linearLayout2.addView(mediaBarWidget.z0());
                k77 k776 = k77Arr19[9];
                linearLayout2.addView((az1) mediaBarWidget.F0.getValue());
                FrameLayout frameLayout5 = new FrameLayout(linearLayout2.getContext());
                frameLayout5.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                k77 k777 = k77Arr19[7];
                frameLayout5.addView((az1) mediaBarWidget.C0.getValue());
                frameLayout5.addView(mediaBarWidget.y0());
                linearLayout2.addView(frameLayout5);
                return linearLayout2;
            case 15:
                return mediaBarWidget.e1;
            case 16:
                k77[] k77Arr20 = MediaBarWidget.h1;
                mediaBarWidget.A0().z0.K(4);
                ek8.g(mediaBarWidget.q0(), MediaBarWidget.i1, (u16) null);
                mediaBarWidget.v0().setLeftIcon(phc.Z0);
                return jue;
            case 17:
                k77[] k77Arr21 = MediaBarWidget.h1;
                FrameLayout frameLayout6 = new FrameLayout(mediaBarWidget.getContext());
                frameLayout6.setId(yob.media_bar__bottom_container);
                return frameLayout6;
            case 18:
                k77[] k77Arr22 = MediaBarWidget.h1;
                LinearLayout linearLayout3 = new LinearLayout(mediaBarWidget.getContext());
                linearLayout3.setOrientation(1);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 80;
                linearLayout3.setLayoutParams(layoutParams4);
                k77[] k77Arr23 = MediaBarWidget.h1;
                k77 k778 = k77Arr23[13];
                linearLayout3.addView((LinearLayout) mediaBarWidget.N0.getValue());
                linearLayout3.addView(mediaBarWidget.v0());
                k77 k779 = k77Arr23[16];
                linearLayout3.addView((az1) mediaBarWidget.T0.getValue());
                ek8.g(linearLayout3, MediaBarWidget.i1, (u16) null);
                urd.B(new o(3, (Continuation) null, 5), linearLayout3);
                linearLayout3.addOnLayoutChangeListener(new s41(3, mediaBarWidget));
                linearLayout3.setClickable(true);
                return linearLayout3;
            case 19:
                k77[] k77Arr24 = MediaBarWidget.h1;
                return hhd.a(mediaBarWidget.getContext());
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                k77[] k77Arr25 = MediaBarWidget.h1;
                return new f56(new j08(mediaBarWidget, 12));
            default:
                k77[] k77Arr26 = MediaBarWidget.h1;
                FrameLayout frameLayout7 = new FrameLayout(mediaBarWidget.getContext());
                frameLayout7.setId(j2a.y);
                frameLayout7.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout7.setVisibility(8);
                return frameLayout7;
        }
    }
}
