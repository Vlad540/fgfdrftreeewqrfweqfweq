package one.me.mediapicker;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/mediapicker/MediaPickerScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lq46;", "galleryMode", "(Lq46;)V", "media-picker_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class MediaPickerScreen extends Widget {
    public static final /* synthetic */ k77[] F0;
    public final nl0 A0;
    public final nl0 B0;
    public final nl0 C0;
    public final n0c D0;
    public final nl0 E0;
    public final jj7 X;
    public final t97 Y;
    public final t97 Z;
    public final sy6 a;
    public final n0c b;
    public final String c;
    public final jr o;
    public final t97 w0;
    public final n0c x0;
    public final nl0 y0;
    public final jr z0;

    static {
        Class<MediaPickerScreen> cls = MediaPickerScreen.class;
        F0 = new k77[]{new khb(cls, "primaryRouter", "getPrimaryRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), m4b.g(m7c.a, cls, "galleryMode", "getGalleryMode()Lone/me/sdk/gallery/GalleryMode;", 0), new khb(cls, "selectedAlbumRouter", "getSelectedAlbumRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new khb(cls, "selectedAlbumContainer", "getSelectedAlbumContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hc9(cls, "maxHeightAlbumsContent", "getMaxHeightAlbumsContent()I"), new khb(cls, "mediaPickerContainer", "getMediaPickerContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new khb(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new khb(cls, "divider", "getDivider()Landroid/view/View;", 0), new khb(cls, "contentContainer", "getContentContainer()Landroid/widget/FrameLayout;", 0)};
    }

    public MediaPickerScreen(q46 q46) {
        this(jjd.j(new wia[]{new wia("gallery_mode_args", q46)}));
    }

    public static final void l0(MediaPickerScreen mediaPickerScreen, boolean z) {
        nl0 nl0 = mediaPickerScreen.E0;
        int i = 8;
        if (z) {
            ((View) nl0.getValue()).setVisibility(0);
        } else if (nl0.a()) {
            ((TextView) nl0.getValue()).setVisibility(8);
        }
        k77 k77 = F0[5];
        az1 az1 = (az1) mediaPickerScreen.A0.getValue();
        if (!z) {
            i = 0;
        }
        az1.setVisibility(i);
    }

    public final sy6 getInsetsConfig() {
        return this.a;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m8getScopeIdIluPPks() {
        return this.c;
    }

    public final rnc getScreenDelegate() {
        return this.X;
    }

    public final q46 m0() {
        k77 k77 = F0[1];
        return (q46) this.o.a(this);
    }

    public final nea n0() {
        k77 k77 = F0[6];
        return (nea) this.B0.getValue();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Rect rect;
        String stringExtra;
        MediaPickerScreen.super.onActivityResult(i, i2, intent);
        if (i == 666 && i2 == -1 && (!m0().c)) {
            rr3 rr3 = null;
            if (intent == null) {
                udd.s(MediaPickerScreen.class.getName(), "ActAvatarCrop sent empty data", (Throwable) null);
                return;
            }
            RectF rectF = (RectF) ((Parcelable) fja.i(intent, "ru.ok.tamtam.extra.CROPPED_RECT", RectF.class));
            if (rectF != null && (rect = (Rect) ((Parcelable) fja.i(intent, "ru.ok.tamtam.extra.CROPPED_ABSOLUTE", Rect.class))) != null && (stringExtra = intent.getStringExtra("ru.ok.tamtam.extra.FILE_PATH")) != null) {
                sgc router = getRouter();
                lr lrVar = new lr();
                lrVar.b(router);
                loop0:
                while (true) {
                    if (!(!lrVar.isEmpty())) {
                        break;
                    }
                    sgc sgc = (sgc) lrVar.k();
                    int A = p23.A(sgc.e());
                    while (true) {
                        if (-1 < A) {
                            rr3 rr32 = ((vgc) sgc.e().get(A)).a;
                            if (rr32 instanceof ac0) {
                                rr3 = rr32;
                                break loop0;
                            }
                            zcc it = new adc(rr32.getChildRouters()).iterator();
                            while (true) {
                                ListIterator listIterator = it.b;
                                if (!listIterator.hasPrevious()) {
                                    break;
                                }
                                lrVar.b((sgc) listIterator.previous());
                            }
                            A--;
                        }
                    }
                }
                ac0 ac0 = (ac0) rr3;
                if (ac0 != null) {
                    ac0.a(stringExtra, rectF, rect);
                }
                getRouter().C();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(n0());
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setId(q6a.c);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setGravity(17);
        k77[] k77Arr = F0;
        k77 k77 = k77Arr[5];
        frameLayout.addView((az1) this.A0.getValue());
        k77 k772 = k77Arr[3];
        frameLayout.addView((az1) this.y0.getValue());
        k77 k773 = k77Arr[7];
        frameLayout.addView((View) this.C0.getValue());
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    public final void onViewCreated(View view) {
        t97 t97 = this.w0;
        t0c t0c = ((n98) t97.getValue()).A0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new g98((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(((f56) this.Y.getValue()).c, getViewLifecycleOwner().R(), ob7), new h98((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(((n98) t97.getValue()).z0, getViewLifecycleOwner().R(), ob7), new i98((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(((qvc) this.Z.getValue()).o, getViewLifecycleOwner().R(), ob7), new j98((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public MediaPickerScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = sy6.d;
        this.b = childSlotRouter(q6a.b);
        this.c = "MediaPickerScreenScopeId";
        this.o = new jr(q46.class, "gallery_mode_args");
        this.X = new jj7(new ib7(20), (s16) null, 6);
        this.Y = createViewModelLazy(f56.class, new js5(20, new ib7(21)));
        this.Z = createViewModelLazy(qvc.class, new js5(21, new f98(this, 1)));
        this.w0 = createViewModelLazy(n98.class, new js5(22, new f98(this, 2)));
        this.x0 = childSlotRouter(q6a.a);
        this.y0 = binding(new f98(this, 3));
        this.z0 = new jr(Integer.class, 0, "max_height_albums_content");
        this.A0 = binding(new f98(this, 4));
        this.B0 = binding(new f98(this, 5));
        this.C0 = binding(new f98(this, 6));
        this.D0 = viewBinding(q6a.c);
        this.E0 = binding(new f98(this, 7));
    }
}
