package ru.ok.android.externcalls.sdk.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import org.webrtc.GlRectDrawer;
import org.webrtc.Logging;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface;

@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 ¢\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\b¢\u0001£\u0001¤\u0001¥\u0001B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\u00020\u00192\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00190\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010#\u001a\u00020\u00192\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0012\u0018\u00010 ¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0019H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00192\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b.\u0010/J\u001f\u0010,\u001a\u00020\u00192\u0006\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020*H\u0016¢\u0006\u0004\b,\u00102J\u0015\u00105\u001a\u00020\u00192\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0019¢\u0006\u0004\b7\u0010&J\r\u00108\u001a\u00020\u0019¢\u0006\u0004\b8\u0010&J\u000f\u00109\u001a\u00020\u0019H\u0016¢\u0006\u0004\b9\u0010&J\u0015\u0010;\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u0012¢\u0006\u0004\b;\u0010)J\u0015\u0010=\u001a\u00020\u00192\u0006\u0010<\u001a\u00020!¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\bH\u0014¢\u0006\u0004\bA\u0010BJ7\u0010H\u001a\u00020\u00192\u0006\u0010C\u001a\u00020\u00122\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0014¢\u0006\u0004\bH\u0010IJ\u001f\u0010K\u001a\u00020\u00192\u0006\u0010<\u001a\u00020!2\u0006\u0010J\u001a\u00020\u0012H\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\u00020\u00192\u0006\u0010<\u001a\u00020!2\u0006\u0010J\u001a\u00020\u0012H\u0002¢\u0006\u0004\bM\u0010LJ\u000f\u0010N\u001a\u00020\u0019H\u0002¢\u0006\u0004\bN\u0010&J\u000f\u0010O\u001a\u00020\u0019H\u0002¢\u0006\u0004\bO\u0010&J\u000f\u0010P\u001a\u00020\u0019H\u0002¢\u0006\u0004\bP\u0010&J\u000f\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ?\u0010Y\u001a\u00020\u00122\u0006\u0010T\u001a\u00020\b2\u0006\u0010U\u001a\u00020\b2\u0006\u0010V\u001a\u00020\b2\u0006\u0010W\u001a\u00020\b2\u0006\u0010X\u001a\u00020\b2\u0006\u0010J\u001a\u00020\u0012H\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020\u00192\u0006\u0010[\u001a\u00020QH\u0002¢\u0006\u0004\b\\\u0010]J\u001f\u0010`\u001a\u00020\u00192\u0006\u0010^\u001a\u00020\b2\u0006\u0010_\u001a\u00020\bH\u0003¢\u0006\u0004\b`\u0010BJ\u000f\u0010a\u001a\u00020\u0019H\u0002¢\u0006\u0004\ba\u0010&R\u0014\u0010b\u001a\u00020Q8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010q\u001a\u00020n8\u0002X\u0004¢\u0006\u0006\n\u0004\bq\u0010pR\u0016\u0010r\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bt\u0010sR.\u0010w\u001a\u0004\u0018\u00010u2\b\u0010v\u001a\u0004\u0018\u00010u8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0018\u0010~\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b~\u0010R\u0017\u0010:\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b:\u0010\u0001R*\u0010\u0001\u001a\u00020\u00122\u0007\u0010\u0001\u001a\u00020\u00128\u0006@BX\u000e¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00020\u00122\u0007\u0010\u0001\u001a\u00020\u00128\u0006@BX\u000e¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020k8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010mR\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0016\u0010\u0001R'\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0012\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R(\u0010\u0001\u001a\u00020\u00128\u0016@\u0016X\u000e¢\u0006\u0017\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0005\b\u0001\u0010)R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R(\u0010\u0001\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0017\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0005\b\u0001\u0010)R\u0017\u0010¡\u0001\u001a\u00020\u00128VX\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010\u0001¨\u0006¦\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer;", "Landroid/view/TextureView;", "Lorg/webrtc/VideoSink;", "Lru/ok/android/externcalls/sdk/ui/RendererView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ltc1;", "renderer", "Lorg/webrtc/RendererCommon$RendererEvents;", "rendererEvents", "Lorg/webrtc/RendererCommon$GlDrawer;", "drawer", "", "init", "(Ltc1;Lorg/webrtc/RendererCommon$RendererEvents;Lorg/webrtc/RendererCommon$GlDrawer;)Z", "Lru/ok/android/externcalls/sdk/ui/FrameDecorator;", "frameDecorator", "(Ltc1;Lorg/webrtc/RendererCommon$RendererEvents;Lru/ok/android/externcalls/sdk/ui/FrameDecorator;)Z", "decorator", "Ljue;", "setFrameDecorator", "(Lru/ok/android/externcalls/sdk/ui/FrameDecorator;)V", "Lkotlin/Function2;", "listener", "setFrameSizeListener", "(Li26;)V", "Lkotlin/Function1;", "Lorg/webrtc/VideoFrame;", "frameSkipCondition", "setFrameSkipCondition", "(Lu16;)V", "release", "()V", "mirror", "setMirror", "(Z)V", "Lorg/webrtc/RendererCommon$ScalingType;", "scalingType", "setScalingType", "(Lorg/webrtc/RendererCommon$ScalingType;)V", "setRenderEventsListener", "(Lorg/webrtc/RendererCommon$RendererEvents;)V", "scalingTypeMatchOrientation", "scalingTypeMismatchOrientation", "(Lorg/webrtc/RendererCommon$ScalingType;Lorg/webrtc/RendererCommon$ScalingType;)V", "", "fps", "setFpsReduction", "(F)V", "disableFpsReduction", "pauseVideo", "clearImage", "doRender", "setRender", "frame", "onFrame", "(Lorg/webrtc/VideoFrame;)V", "widthSpec", "heightSpec", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "isPostponedFrame", "handleFrame", "(Lorg/webrtc/VideoFrame;Z)V", "postponeFrame", "dropPostponedFrameIfExists", "deliverPostponedFrame", "maybeReleaseLastSizeListener", "", "getResourceName", "()Ljava/lang/String;", "newWidth", "newHeight", "newRotatedFrameWidth", "newRotatedFrameHeight", "newFrameRotation", "updateFrameDimensionsAndReportEvents", "(IIIIIZ)Z", "string", "logD", "(Ljava/lang/String;)V", "width", "height", "updateTextureSize", "notifyTextureSizeChanged", "resourceName", "Ljava/lang/String;", "Lorg/webrtc/RendererCommon$VideoLayoutMeasure;", "videoLayoutMeasure", "Lorg/webrtc/RendererCommon$VideoLayoutMeasure;", "Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface;", "videoRenderer", "Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface;", "Lorg/webrtc/RendererCommon$RendererEvents;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isFirstFrameRendered", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$FrameSize;", "rotatedFrameSize", "Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$FrameSize;", "measureFrameSize", "textureWidth", "I", "textureHeight", "Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$SizeChangeListener;", "value", "sizeChangeListener", "Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$SizeChangeListener;", "getSizeChangeListener", "()Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$SizeChangeListener;", "setSizeChangeListener", "(Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$SizeChangeListener;)V", "Landroid/view/Surface;", "surface", "Landroid/view/Surface;", "Z", "<set-?>", "isInitialized", "()Z", "isReleased", "layoutReadyToRender", "Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface$FrameSizeListener;", "lastSizeListener", "Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface$FrameSizeListener;", "Ljava/util/concurrent/atomic/AtomicReference;", "postponedFrame", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/lang/Runnable;", "postponedFrameSafeguard", "Ljava/lang/Runnable;", "deliverPostponedFrameRunnable", "Lru/ok/android/externcalls/sdk/ui/FrameDecorator;", "frameSkipPredicate", "Lu16;", "needsClearImage", "useAlternateLayout", "getUseAlternateLayout", "setUseAlternateLayout", "Landroid/graphics/Point;", "alternateLayoutOutPoint", "Landroid/graphics/Point;", "Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$PostponedFrameStatistics;", "postponedFrameStatistics", "Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$PostponedFrameStatistics;", "clearImageOnSizeChange", "getClearImageOnSizeChange", "setClearImageOnSizeChange", "getHasImage", "hasImage", "Companion", "FrameSize", "PostponedFrameStatistics", "SizeChangeListener", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public class TextureViewRenderer extends TextureView implements VideoSink, RendererView {
    public static final Companion Companion = new Companion((x54) null);
    private static final int MAX_SCALE_FACTOR = 2;
    private static final long POSTPONED_FRAME_SAFEGUARD_DELAY_MILLIS = 250;
    private static final long POSTPONED_FRAME_STAT_LOG_INTERVAL_MILLIS = 20000;
    private static final String TAG = "TextureViewRenderer";
    private final Point alternateLayoutOutPoint;
    private boolean clearImageOnSizeChange;
    private final Runnable deliverPostponedFrameRunnable;
    private volatile boolean doRender;
    private FrameDecorator frameDecorator;
    private volatile u16 frameSkipPredicate;
    private final AtomicBoolean isFirstFrameRendered;
    private boolean isInitialized;
    private boolean isReleased;
    private VideoRendererInterface.FrameSizeListener lastSizeListener;
    private final AtomicBoolean layoutReadyToRender;
    private final FrameSize measureFrameSize;
    /* access modifiers changed from: private */
    public volatile boolean needsClearImage;
    private final AtomicReference<VideoFrame> postponedFrame;
    private final Runnable postponedFrameSafeguard;
    private final PostponedFrameStatistics postponedFrameStatistics;
    private RendererCommon.RendererEvents rendererEvents;
    private final String resourceName;
    private final FrameSize rotatedFrameSize;
    private SizeChangeListener sizeChangeListener;
    /* access modifiers changed from: private */
    public Surface surface;
    private int textureHeight;
    private int textureWidth;
    private boolean useAlternateLayout;
    private final RendererCommon.VideoLayoutMeasure videoLayoutMeasure;
    /* access modifiers changed from: private */
    public final VideoRendererInterface videoRenderer;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$Companion;", "", "()V", "MAX_SCALE_FACTOR", "", "POSTPONED_FRAME_SAFEGUARD_DELAY_MILLIS", "", "POSTPONED_FRAME_STAT_LOG_INTERVAL_MILLIS", "TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(x54 x54) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0013J\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$FrameSize;", "", "", "rotatedFrameWidth", "rotatedFrameHeight", "frameRotation", "<init>", "(III)V", "width", "height", "rotation", "", "isPostponedFrame", "unsafeSet", "(IIIZ)Z", "set", "", "ratio", "()F", "()I", "size", "Ljue;", "get", "(Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$FrameSize;)V", "I", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class FrameSize {
        private int frameRotation;
        private int rotatedFrameHeight;
        private int rotatedFrameWidth;

        public FrameSize() {
            this(0, 0, 0, 7, (x54) null);
        }

        private final boolean unsafeSet(int i, int i2, int i3, boolean z) {
            if (this.rotatedFrameWidth == i && this.rotatedFrameHeight == i2 && this.frameRotation == i3) {
                return false;
            }
            if (!z) {
                this.rotatedFrameWidth = i;
                this.rotatedFrameHeight = i2;
                this.frameRotation = i3;
            }
            return true;
        }

        public final synchronized void get(FrameSize frameSize) {
            frameSize.unsafeSet(this.rotatedFrameWidth, this.rotatedFrameHeight, this.frameRotation, false);
        }

        public final int height() {
            return this.rotatedFrameHeight;
        }

        public final float ratio() {
            return ((float) this.rotatedFrameWidth) / ((float) this.rotatedFrameHeight);
        }

        public final synchronized boolean set(int i, int i2, int i3, boolean z) {
            return unsafeSet(i, i2, i3, z);
        }

        public final int width() {
            return this.rotatedFrameWidth;
        }

        public FrameSize(int i, int i2, int i3) {
            this.rotatedFrameWidth = i;
            this.rotatedFrameHeight = i2;
            this.frameRotation = i3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FrameSize(int i, int i2, int i3, int i4, x54 x54) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0003R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$PostponedFrameStatistics;", "", "<init>", "()V", "Ljue;", "logStatisticsIfNeeded", "", "value", "toPercent", "(D)D", "", "isPostponedFrame", "postponed", "(Z)V", "delivered", "dropped", "rejected", "", "postponedCount", "J", "repostponedCount", "deliveredCount", "rejectedCount", "droppedCount", "lastLogTime", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class PostponedFrameStatistics {
        private long deliveredCount;
        private long droppedCount;
        private long lastLogTime;
        private long postponedCount;
        private long rejectedCount;
        private long repostponedCount;

        private final void logStatisticsIfNeeded() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.lastLogTime >= TextureViewRenderer.POSTPONED_FRAME_STAT_LOG_INTERVAL_MILLIS) {
                long j = this.postponedCount;
                double d = 0.0d;
                double percent = j > 0 ? toPercent(((double) this.deliveredCount) / ((double) j)) : 0.0d;
                long j2 = this.postponedCount;
                double percent2 = j2 > 0 ? toPercent(((double) this.rejectedCount) / ((double) j2)) : 0.0d;
                long j3 = this.postponedCount;
                if (j3 > 0) {
                    d = toPercent(((double) this.droppedCount) / ((double) j3));
                }
                long j4 = this.postponedCount;
                long j5 = this.repostponedCount;
                long j6 = this.droppedCount;
                long j7 = elapsedRealtime;
                long j8 = this.deliveredCount;
                double d2 = percent2;
                long j9 = this.rejectedCount;
                StringBuilder k = hr1.k(j4, "postponed: ", ", re-postponed: ");
                k.append(j5);
                hr1.s(k, ", dropped: ", j6, " (");
                k.append(d);
                hr1.s(k, "%), delivered: ", j8, " (");
                k.append(percent);
                hr1.s(k, "%), rejected: ", j9, " (");
                k.append(d2);
                k.append("%)");
                Logging.d("TextureViewRenderer_pfs", k.toString());
                this.repostponedCount = 0;
                this.postponedCount = 0;
                this.deliveredCount = 0;
                this.rejectedCount = 0;
                this.droppedCount = 0;
                this.lastLogTime = j7;
            }
        }

        private final double toPercent(double d) {
            return ((double) a24.Y(d * ((double) 10000))) / 100.0d;
        }

        public final void delivered() {
            this.deliveredCount++;
            logStatisticsIfNeeded();
        }

        public final void dropped() {
            this.droppedCount++;
            logStatisticsIfNeeded();
        }

        public final void postponed(boolean z) {
            if (z) {
                this.repostponedCount++;
            } else {
                this.postponedCount++;
            }
            logStatisticsIfNeeded();
        }

        public final void rejected() {
            this.rejectedCount++;
            logStatisticsIfNeeded();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0007ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/ui/TextureViewRenderer$SizeChangeListener;", "", "", "w", "h", "Ljue;", "onTextureSizeChanged", "(II)V", "onFrameSizeChanged", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public interface SizeChangeListener {
        void onFrameSizeChanged(int i, int i2);

        void onTextureSizeChanged(int i, int i2);
    }

    public TextureViewRenderer(Context context) {
        this(context, (AttributeSet) null, 0, 6, (x54) null);
    }

    private final void deliverPostponedFrame() {
        VideoFrame andSet = this.postponedFrame.getAndSet((Object) null);
        if (andSet != null) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.removeCallbacks(this.postponedFrameSafeguard);
            }
            try {
                handleFrame(andSet, true);
            } finally {
                andSet.release();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void deliverPostponedFrameRunnable$lambda$1(TextureViewRenderer textureViewRenderer) {
        textureViewRenderer.deliverPostponedFrame();
    }

    private final void dropPostponedFrameIfExists() {
        VideoFrame andSet = this.postponedFrame.getAndSet((Object) null);
        if (andSet != null) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.removeCallbacks(this.deliverPostponedFrameRunnable);
                handler.removeCallbacks(this.postponedFrameSafeguard);
            }
            andSet.release();
            this.postponedFrameStatistics.dropped();
        }
    }

    private final String getResourceName() {
        try {
            String resourceEntryName = getResources().getResourceEntryName(getId());
            return resourceEntryName + ": ";
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    private final void handleFrame(VideoFrame videoFrame, boolean z) {
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        if (!updateFrameDimensionsAndReportEvents(buffer.getWidth(), buffer.getHeight(), videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), videoFrame.getRotation(), z)) {
            this.postponedFrameStatistics.rejected();
        } else if (this.layoutReadyToRender.get()) {
            if (this.isFirstFrameRendered.compareAndSet(false, true)) {
                logD("Reporting first rendered frame.");
                RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
                if (rendererEvents2 != null) {
                    rendererEvents2.onFirstFrameRendered();
                }
            }
            if (this.needsClearImage) {
                this.needsClearImage = false;
                this.videoRenderer.clearImage();
            }
            this.videoRenderer.onFrame(videoFrame);
            dropPostponedFrameIfExists();
            if (z) {
                this.postponedFrameStatistics.delivered();
            }
        } else {
            int id = getId();
            logD("skipping frame for " + this + " - " + id);
            if (isAttachedToWindow() && isShown()) {
                postponeFrame(videoFrame, z);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void logD(String str) {
        String str2 = this.resourceName;
        Logging.d(TAG, str2 + str);
    }

    private final void maybeReleaseLastSizeListener() {
        VideoRendererInterface.FrameSizeListener frameSizeListener = this.lastSizeListener;
        if (frameSizeListener != null) {
            this.videoRenderer.removeFrameSizeListener(frameSizeListener);
        }
        this.lastSizeListener = null;
    }

    private final void notifyTextureSizeChanged() {
        post(new khe(this, 0));
    }

    /* access modifiers changed from: private */
    public static final void notifyTextureSizeChanged$lambda$9(TextureViewRenderer textureViewRenderer) {
        SizeChangeListener sizeChangeListener2 = textureViewRenderer.sizeChangeListener;
        if (sizeChangeListener2 != null) {
            sizeChangeListener2.onTextureSizeChanged(textureViewRenderer.textureWidth, textureViewRenderer.textureHeight);
        }
    }

    private final void postponeFrame(VideoFrame videoFrame, boolean z) {
        videoFrame.retain();
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.postponedFrameSafeguard);
        }
        VideoFrame andSet = this.postponedFrame.getAndSet(videoFrame);
        if (andSet != null) {
            andSet.release();
            this.postponedFrameStatistics.dropped();
        }
        Handler handler2 = getHandler();
        if (handler2 != null) {
            handler2.postDelayed(this.postponedFrameSafeguard, POSTPONED_FRAME_SAFEGUARD_DELAY_MILLIS);
        }
        this.postponedFrameStatistics.postponed(z);
    }

    /* access modifiers changed from: private */
    public static final void postponedFrameSafeguard$lambda$0(TextureViewRenderer textureViewRenderer) {
        textureViewRenderer.dropPostponedFrameIfExists();
    }

    /* access modifiers changed from: private */
    public static final void setFrameSizeListener$lambda$2(i26 i26, int i, int i2) {
        i26.invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }

    private final boolean updateFrameDimensionsAndReportEvents(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (!this.rotatedFrameSize.set(i3, i4, i5, z)) {
            return true;
        }
        if (z) {
            return false;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.deliverPostponedFrameRunnable);
        }
        this.layoutReadyToRender.set(false);
        logD("Reporting frame resolution changed to " + i + "x" + i2 + " with rotation " + i5);
        RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
        if (rendererEvents2 != null) {
            rendererEvents2.onFrameResolutionChanged(i, i2, i5);
        }
        post(new as0(this, i3, i4, 8));
        return true;
    }

    /* access modifiers changed from: private */
    public static final void updateFrameDimensionsAndReportEvents$lambda$8(TextureViewRenderer textureViewRenderer, int i, int i2) {
        SizeChangeListener sizeChangeListener2 = textureViewRenderer.sizeChangeListener;
        if (sizeChangeListener2 != null) {
            sizeChangeListener2.onFrameSizeChanged(i, i2);
        }
        textureViewRenderer.requestLayout();
    }

    /* access modifiers changed from: private */
    public final void updateTextureSize(int i, int i2) {
        this.textureWidth = i;
        this.textureHeight = i2;
        notifyTextureSizeChanged();
    }

    public void clearImage() {
        this.videoRenderer.clearImage();
        this.isFirstFrameRendered.set(false);
    }

    public final void disableFpsReduction() {
        this.videoRenderer.disableFpsReduction();
    }

    public final boolean getClearImageOnSizeChange() {
        return this.clearImageOnSizeChange;
    }

    public boolean getHasImage() {
        return this.isFirstFrameRendered.get();
    }

    public final SizeChangeListener getSizeChangeListener() {
        return this.sizeChangeListener;
    }

    public boolean getUseAlternateLayout() {
        return this.useAlternateLayout;
    }

    public boolean init(tc1 tc1, RendererCommon.RendererEvents rendererEvents2, RendererCommon.GlDrawer glDrawer) {
        if (this.isInitialized) {
            return false;
        }
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents2;
        this.rotatedFrameSize.set(0, 0, 0, false);
        this.videoRenderer.init(tc1, glDrawer);
        this.isInitialized = true;
        return true;
    }

    public final boolean isInitialized() {
        return this.isInitialized;
    }

    public final boolean isReleased() {
        return this.isReleased;
    }

    public final void onFrame(VideoFrame videoFrame) {
        if (this.doRender) {
            VideoFrame apply = this.frameDecorator.apply(videoFrame);
            u16 u16 = this.frameSkipPredicate;
            if (u16 == null || !((Boolean) u16.invoke(videoFrame)).booleanValue()) {
                handleFrame(apply, false);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.videoRenderer.setLayoutAspectRatio(((float) (i3 - i)) / ((float) (i4 - i2)));
        if (this.layoutReadyToRender.compareAndSet(false, true) && getHandler() != null) {
            removeCallbacks(this.deliverPostponedFrameRunnable);
            post(this.deliverPostponedFrameRunnable);
        }
    }

    public void onMeasure(int i, int i2) {
        Point point;
        ThreadUtils.checkIsOnMainThread();
        this.rotatedFrameSize.get(this.measureFrameSize);
        if (getUseAlternateLayout()) {
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i);
            float ratio = this.measureFrameSize.ratio();
            int i3 = (int) (((float) size) * ratio);
            if (i3 <= size2) {
                size2 = i3;
            }
            if (size2 > View.MeasureSpec.getSize(i) * 2) {
                size2 = View.MeasureSpec.getSize(i) * 2;
            }
            this.alternateLayoutOutPoint.set(size2, (int) (((float) size2) / ratio));
            point = this.alternateLayoutOutPoint;
        } else {
            point = this.videoLayoutMeasure.measure(i, i2, this.measureFrameSize.width(), this.measureFrameSize.height());
        }
        setMeasuredDimension(point.x, point.y);
    }

    public final void pauseVideo() {
        this.videoRenderer.pauseVideo();
    }

    public void release() {
        if (!this.isReleased) {
            dropPostponedFrameIfExists();
            this.rendererEvents = null;
            maybeReleaseLastSizeListener();
            this.videoRenderer.release();
            Surface surface2 = this.surface;
            if (surface2 != null) {
                surface2.release();
            }
            this.isFirstFrameRendered.set(false);
            this.isReleased = true;
        }
    }

    public final void setClearImageOnSizeChange(boolean z) {
        this.clearImageOnSizeChange = z;
    }

    public final void setFpsReduction(float f) {
        this.videoRenderer.setFpsReduction(f);
    }

    public void setFrameDecorator(FrameDecorator frameDecorator2) {
        this.frameDecorator = frameDecorator2;
    }

    public void setFrameSizeListener(i26 i26) {
        maybeReleaseLastSizeListener();
        VideoRendererInterface videoRendererInterface = this.videoRenderer;
        lhe lhe = new lhe(i26);
        this.lastSizeListener = lhe;
        videoRendererInterface.addFrameSizeListener(lhe);
    }

    public final void setFrameSkipCondition(u16 u16) {
        this.frameSkipPredicate = u16;
    }

    public void setMirror(boolean z) {
        this.videoRenderer.setMirror(z);
    }

    public final void setRender(boolean z) {
        this.doRender = z;
    }

    public void setRenderEventsListener(RendererCommon.RendererEvents rendererEvents2) {
        this.rendererEvents = rendererEvents2;
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
    }

    public final void setSizeChangeListener(SizeChangeListener sizeChangeListener2) {
        this.sizeChangeListener = sizeChangeListener2;
        notifyTextureSizeChanged();
    }

    public void setUseAlternateLayout(boolean z) {
        this.useAlternateLayout = z;
    }

    public TextureViewRenderer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (x54) null);
    }

    public TextureViewRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String resourceName2 = getResourceName();
        this.resourceName = resourceName2;
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        this.videoRenderer = VideoRendererInterface.Companion.createRenderer(resourceName2);
        this.isFirstFrameRendered = new AtomicBoolean(false);
        this.rotatedFrameSize = new FrameSize(0, 0, 0, 7, (x54) null);
        this.measureFrameSize = new FrameSize(0, 0, 0, 7, (x54) null);
        this.doRender = true;
        this.layoutReadyToRender = new AtomicBoolean(false);
        this.postponedFrame = new AtomicReference<>((Object) null);
        this.postponedFrameSafeguard = new khe(this, 1);
        this.deliverPostponedFrameRunnable = new khe(this, 2);
        this.frameDecorator = FrameDecorator.Companion.getEMPTY();
        this.alternateLayoutOutPoint = new Point();
        this.postponedFrameStatistics = new PostponedFrameStatistics();
        this.clearImageOnSizeChange = true;
        setSurfaceTextureListener(new TextureView.SurfaceTextureListener(this) {
            final /* synthetic */ TextureViewRenderer this$0;

            {
                this.this$0 = r1;
            }

            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                ThreadUtils.checkIsOnMainThread();
                Surface access$getSurface$p = this.this$0.surface;
                if (access$getSurface$p != null) {
                    access$getSurface$p.release();
                }
                this.this$0.surface = null;
                TextureViewRenderer textureViewRenderer = this.this$0;
                Surface surface = new Surface(surfaceTexture);
                this.this$0.videoRenderer.createEglSurface(surface);
                textureViewRenderer.surface = surface;
                this.this$0.updateTextureSize(i, i2);
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                ThreadUtils.checkIsOnMainThread();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                this.this$0.videoRenderer.releaseEglSurface(new TextureViewRenderer$1$onSurfaceTextureDestroyed$1(countDownLatch));
                ThreadUtils.awaitUninterruptibly(countDownLatch);
                Surface access$getSurface$p = this.this$0.surface;
                if (access$getSurface$p != null) {
                    access$getSurface$p.release();
                }
                this.this$0.surface = null;
                this.this$0.updateTextureSize(0, 0);
                return true;
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                ThreadUtils.checkIsOnMainThread();
                TextureViewRenderer textureViewRenderer = this.this$0;
                textureViewRenderer.logD("surfaceChanged: size: " + i + "x" + i2);
                this.this$0.updateTextureSize(i, i2);
                if (this.this$0.getClearImageOnSizeChange()) {
                    this.this$0.needsClearImage = true;
                }
            }

            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        });
    }

    public void setScalingType(RendererCommon.ScalingType scalingType, RendererCommon.ScalingType scalingType2) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType, scalingType2);
    }

    public boolean init(tc1 tc1, RendererCommon.RendererEvents rendererEvents2, FrameDecorator frameDecorator2) {
        this.frameDecorator = frameDecorator2;
        return init(tc1, rendererEvents2, (RendererCommon.GlDrawer) new GlRectDrawer());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextureViewRenderer(Context context, AttributeSet attributeSet, int i, int i2, x54 x54) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
