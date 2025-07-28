package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.mediapicker.MediaPickerScreen;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;

/* renamed from: f98  reason: default package */
public final /* synthetic */ class f98 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaPickerScreen b;

    public /* synthetic */ f98(MediaPickerScreen mediaPickerScreen, int i) {
        this.a = i;
        this.b = mediaPickerScreen;
    }

    public final Object invoke() {
        View findViewById;
        MediaPickerScreen mediaPickerScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = MediaPickerScreen.F0;
                if (!(((n98) mediaPickerScreen.w0.getValue()).A0.a.getValue() instanceof cq3)) {
                    k77[] k77Arr2 = MediaPickerScreen.F0;
                    k77 k77 = k77Arr2[3];
                    ((az1) mediaPickerScreen.y0.getValue()).setVisibility(0);
                    k77 k772 = k77Arr2[7];
                    ((View) mediaPickerScreen.C0.getValue()).setVisibility(0);
                    k77 k773 = k77Arr2[2];
                    n0c n0c = mediaPickerScreen.x0;
                    ax2 ax2 = (ax2) n0c.T0(mediaPickerScreen, k773);
                    if (!hhd.f(ax2.b(), "SELECT_ALBUM_WIDGET_TAG")) {
                        vgc vgc = new vgc(new SelectAlbumWidget(mediaPickerScreen.c, (x54) null), (String) null, (wr3) null, (wr3) null, false, -1);
                        vgc.d("SELECT_ALBUM_WIDGET_TAG");
                        ax2.a.R(vgc);
                    }
                    SelectAlbumWidget a2 = ((ax2) n0c.T0(mediaPickerScreen, k77Arr2[2])).a();
                    SelectAlbumWidget selectAlbumWidget = a2 instanceof SelectAlbumWidget ? a2 : null;
                    if (selectAlbumWidget != null) {
                        View view = selectAlbumWidget.getView();
                        if (!(view == null || (findViewById = view.findViewById(s9a.d)) == null)) {
                            int height = findViewById.getHeight();
                            k77 k774 = k77Arr2[4];
                            mediaPickerScreen.z0.b(mediaPickerScreen, Integer.valueOf(height));
                            urd.B(new a3(3, (Continuation) null, 2), findViewById);
                        }
                        selectAlbumWidget.o0();
                    }
                }
                return jue.a;
            case 1:
                k77[] k77Arr3 = MediaPickerScreen.F0;
                return new qvc((gl7) a98.a.getAccessor().c(gl7.class), new evc(mediaPickerScreen.m0().w0, false));
            case 2:
                k77[] k77Arr4 = MediaPickerScreen.F0;
                return new n98(mediaPickerScreen.m0(), (qvc) mediaPickerScreen.Z.getValue(), (f56) mediaPickerScreen.Y.getValue());
            case 3:
                k77[] k77Arr5 = MediaPickerScreen.F0;
                FrameLayout frameLayout = new FrameLayout(mediaPickerScreen.getContext());
                frameLayout.setId(q6a.a);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setVisibility(8);
                return frameLayout;
            case 4:
                k77[] k77Arr6 = MediaPickerScreen.F0;
                FrameLayout frameLayout2 = new FrameLayout(mediaPickerScreen.getContext());
                frameLayout2.setId(q6a.b);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                frameLayout2.setLayoutParams(layoutParams);
                return frameLayout2;
            case 5:
                k77[] k77Arr7 = MediaPickerScreen.F0;
                nea nea = new nea(mediaPickerScreen.getContext(), 6);
                nea.setId(q6a.e);
                nea.setTitle(r6a.a);
                nea.setLeftActions(new vda(new e98(0, mediaPickerScreen)));
                nea.setTitleClickListener(new f98(mediaPickerScreen, 0));
                nea.setShowDropdown(true);
                return nea;
            case 6:
                k77[] k77Arr8 = MediaPickerScreen.F0;
                View view2 = new View(mediaPickerScreen.getContext());
                view2.setId(q6a.d);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, a24.X(((float) 1) * dh4.c().getDisplayMetrics().density));
                layoutParams2.gravity = 48;
                view2.setLayoutParams(layoutParams2);
                urd.B(new a3(3, (Continuation) null, 1), view2);
                view2.setVisibility(8);
                return view2;
            default:
                k77[] k77Arr9 = MediaPickerScreen.F0;
                TextView textView = new TextView(mediaPickerScreen.getContext());
                textView.setText(r6a.c);
                nte.r.b(textView, yq4.b);
                textView.setGravity(17);
                urd.B(new y9(3, (Continuation) null, 17), textView);
                ((FrameLayout) mediaPickerScreen.D0.T0(mediaPickerScreen, MediaPickerScreen.F0[8])).addView(textView);
                return textView;
        }
    }
}
