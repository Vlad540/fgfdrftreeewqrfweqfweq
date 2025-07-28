package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Parcelable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import jp.co.cyberagent.android.gpuimage.GPUImageNativeLibrary;

/* renamed from: q34  reason: default package */
public final /* synthetic */ class q34 implements kh7, lh7, ub4, of3, h73 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object o;

    public /* synthetic */ q34(fd fdVar, xi7 xi7, i78 i78, IOException iOException, boolean z) {
        this.a = 0;
        this.o = xi7;
        this.X = i78;
        this.b = iOException;
        this.c = z;
    }

    public void accept(Object obj) {
        sd0 sd0 = (sd0) obj;
        ((bd4) this.o).getClass();
        ls4 ls4 = (ls4) this.X;
        ps4 ps4 = ls4.a;
        ArrayList arrayList = ps4.a;
        ListIterator listIterator = arrayList.listIterator();
        while (true) {
            if (listIterator.hasNext()) {
                if (((is4) listIterator.next()) instanceof sd0) {
                    listIterator.set(sd0);
                    ps4.invalidate();
                    break;
                }
            } else {
                arrayList.add(0, sd0);
                ps4.invalidate();
                break;
            }
        }
        ls4.b();
        if (this.c) {
            ls4.a.post(new g5(ls4, (js4) this.b, sd0, 25));
        }
    }

    public void b(x63 x63) {
        Bitmap createBitmap;
        Context context = ((f94) this.o).a;
        int f = xy6.f(context);
        Uri uri = (Uri) this.b;
        Bitmap bitmap = new vm0(context, (Uri) this.X, uri, f, f, (tm0) null).d().a;
        if (bitmap != null) {
            x63 x632 = x63;
            if (((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 131072) {
                b46 b46 = new b46(new z36("varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}"));
                z36 z36 = new z36("   varying highp vec2 textureCoordinate;\n\n    uniform sampler2D inputImageTexture;\n\n    uniform highp vec2 singleStepOffset;\n    uniform highp vec4 params;\n    uniform highp float brightness;\n\n    const highp vec3 W = vec3(0.299, 0.587, 0.114);\n    const highp mat3 saturateMatrix = mat3(\n        1.1102, -0.0598, -0.061,\n        -0.0774, 1.0826, -0.1186,\n        -0.0228, -0.0228, 1.1772);\n    highp vec2 blurCoordinates[24];\n\n    highp float hardLight(highp float color) {\n    if (color <= 0.5)\n        color = color * color * 2.0;\n    else\n        color = 1.0 - ((1.0 - color)*(1.0 - color) * 2.0);\n    return color;\n}\n\n    void main(){\n    highp vec3 centralColor = texture2D(inputImageTexture, textureCoordinate).rgb;\n    blurCoordinates[0] = textureCoordinate.xy + singleStepOffset * vec2(0.0, -10.0);\n    blurCoordinates[1] = textureCoordinate.xy + singleStepOffset * vec2(0.0, 10.0);\n    blurCoordinates[2] = textureCoordinate.xy + singleStepOffset * vec2(-10.0, 0.0);\n    blurCoordinates[3] = textureCoordinate.xy + singleStepOffset * vec2(10.0, 0.0);\n    blurCoordinates[4] = textureCoordinate.xy + singleStepOffset * vec2(5.0, -8.0);\n    blurCoordinates[5] = textureCoordinate.xy + singleStepOffset * vec2(5.0, 8.0);\n    blurCoordinates[6] = textureCoordinate.xy + singleStepOffset * vec2(-5.0, 8.0);\n    blurCoordinates[7] = textureCoordinate.xy + singleStepOffset * vec2(-5.0, -8.0);\n    blurCoordinates[8] = textureCoordinate.xy + singleStepOffset * vec2(8.0, -5.0);\n    blurCoordinates[9] = textureCoordinate.xy + singleStepOffset * vec2(8.0, 5.0);\n    blurCoordinates[10] = textureCoordinate.xy + singleStepOffset * vec2(-8.0, 5.0);\n    blurCoordinates[11] = textureCoordinate.xy + singleStepOffset * vec2(-8.0, -5.0);\n    blurCoordinates[12] = textureCoordinate.xy + singleStepOffset * vec2(0.0, -6.0);\n    blurCoordinates[13] = textureCoordinate.xy + singleStepOffset * vec2(0.0, 6.0);\n    blurCoordinates[14] = textureCoordinate.xy + singleStepOffset * vec2(6.0, 0.0);\n    blurCoordinates[15] = textureCoordinate.xy + singleStepOffset * vec2(-6.0, 0.0);\n    blurCoordinates[16] = textureCoordinate.xy + singleStepOffset * vec2(-4.0, -4.0);\n    blurCoordinates[17] = textureCoordinate.xy + singleStepOffset * vec2(-4.0, 4.0);\n    blurCoordinates[18] = textureCoordinate.xy + singleStepOffset * vec2(4.0, -4.0);\n    blurCoordinates[19] = textureCoordinate.xy + singleStepOffset * vec2(4.0, 4.0);\n    blurCoordinates[20] = textureCoordinate.xy + singleStepOffset * vec2(-2.0, -2.0);\n    blurCoordinates[21] = textureCoordinate.xy + singleStepOffset * vec2(-2.0, 2.0);\n    blurCoordinates[22] = textureCoordinate.xy + singleStepOffset * vec2(2.0, -2.0);\n    blurCoordinates[23] = textureCoordinate.xy + singleStepOffset * vec2(2.0, 2.0);\n\n    highp float sampleColor = centralColor.g * 22.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[0]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[1]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[2]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[3]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[4]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[5]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[6]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[7]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[8]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[9]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[10]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[11]).g;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[12]).g * 2.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[13]).g * 2.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[14]).g * 2.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[15]).g * 2.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[16]).g * 2.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[17]).g * 2.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[18]).g * 2.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[19]).g * 2.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[20]).g * 3.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[21]).g * 3.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[22]).g * 3.0;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[23]).g * 3.0;\n\n    sampleColor = sampleColor / 62.0;\n\n    highp float highPass = centralColor.g - sampleColor + 0.5;\n\n    for (int i = 0; i < 5; i++) {\n        highPass = hardLight(highPass);\n    }\n    highp float lumance = dot(centralColor, W);\n\n    highp float alpha = pow(lumance, params.r);\n\n    highp vec3 smoothColor = centralColor + (centralColor-vec3(highPass))*alpha*0.1;\n\n    smoothColor.r = clamp(pow(smoothColor.r, params.g), 0.0, 1.0);\n    smoothColor.g = clamp(pow(smoothColor.g, params.g), 0.0, 1.0);\n    smoothColor.b = clamp(pow(smoothColor.b, params.g), 0.0, 1.0);\n\n    highp vec3 lvse = vec3(1.0)-(vec3(1.0)-smoothColor)*(vec3(1.0)-centralColor);\n    highp vec3 bianliang = max(smoothColor, centralColor);\n    highp vec3 rouguang = 2.0*centralColor*smoothColor + centralColor*centralColor - 2.0*centralColor*centralColor*smoothColor;\n\n    gl_FragColor = vec4(mix(centralColor, lvse, alpha), 1.0);\n    gl_FragColor.rgb = mix(gl_FragColor.rgb, bianliang, alpha);\n    gl_FragColor.rgb = mix(gl_FragColor.rgb, rouguang, params.b);\n\n    highp vec3 satcolor = gl_FragColor.rgb * saturateMatrix;\n    gl_FragColor.rgb = mix(gl_FragColor.rgb, satcolor, params.a);\n    gl_FragColor.rgb = vec3(gl_FragColor.rgb + vec3(brightness));\n}");
                b46.d(new p36((Object) b46, (Object) z36, false, 8));
                b46.d(new jr1(b46, 1, bitmap));
                b46 b462 = new b46(z36);
                b462.C0 = false;
                b462.D0 = false;
                b462.B0 = 1;
                b462.b();
                b462.E0 = 2;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                EGL10 egl10 = (EGL10) EGLContext.getEGL();
                EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                egl10.eglInitialize(eglGetDisplay, new int[2]);
                int[] iArr = new int[1];
                EGL10 egl102 = egl10;
                EGLDisplay eGLDisplay = eglGetDisplay;
                int[] iArr2 = {12325, 0, 12326, 0, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
                int[] iArr3 = iArr;
                egl102.eglChooseConfig(eGLDisplay, iArr2, (EGLConfig[]) null, 0, iArr3);
                int i = iArr[0];
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                egl102.eglChooseConfig(eGLDisplay, iArr2, eGLConfigArr, i, iArr3);
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                EGLContext eglCreateContext = egl10.eglCreateContext(eglGetDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, width, 12374, height, 12344});
                egl10.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
                GL10 gl10 = (GL10) eglCreateContext.getGL();
                String name = Thread.currentThread().getName();
                if (Thread.currentThread().getName().equals(name)) {
                    b462.onSurfaceCreated(gl10, eGLConfig);
                    b462.onSurfaceChanged(gl10, width, height);
                }
                b462.d(new jr1(b462, 1, bitmap));
                if (!Thread.currentThread().getName().equals(name)) {
                    createBitmap = null;
                } else {
                    b462.onDrawFrame(gl10);
                    b462.onDrawFrame(gl10);
                    createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    GPUImageNativeLibrary.adjustBitmap(createBitmap);
                }
                z36.h = false;
                GLES20.glDeleteProgram(z36.d);
                b462.d(new re(28, b462));
                b462.onDrawFrame(gl10);
                b462.onDrawFrame(gl10);
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, eGLContext);
                egl10.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
                egl10.eglDestroyContext(eglGetDisplay, eglCreateContext);
                egl10.eglTerminate(eglGetDisplay);
                b46.d(new p36((Object) b46, (Object) z36, false, 8));
                b46.d(new jr1(b46, 1, bitmap));
                at7.M(uri.getPath(), createBitmap, 100);
                createBitmap.recycle();
                if (this.c) {
                    try {
                        wx3.J(a06.u().f(tr6.a(uri), (m18) null));
                    } catch (Throwable unused) {
                    }
                }
                if (!x63.h()) {
                    x63.b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("OpenGL ES 2.0 is not supported on this phone.");
        } else if (!x63.h()) {
            IllegalStateException illegalStateException = new IllegalStateException("bitmap not decoded");
            if (!x63.a(illegalStateException)) {
                xs7.F(illegalStateException);
            }
        }
    }

    public void invoke(Object obj) {
        Object obj2 = this.X;
        Object obj3 = this.o;
        boolean z = this.c;
        Object obj4 = this.b;
        switch (this.a) {
            case 0:
                ((n35) obj).getClass();
                StringBuilder sb = new StringBuilder("MediaLoadData{dataType=");
                i78 i78 = (i78) obj2;
                sb.append(i78.a);
                sb.append(", trackType=");
                sb.append(i78.b);
                sb.append(", trackFormat=");
                sb.append((vu5) i78.g);
                sb.append(", trackSelectionReason=");
                sb.append(i78.c);
                sb.append(", trackSelectionData=");
                sb.append(i78.d);
                sb.append(", mediaStartTimeMs=");
                sb.append(i78.e);
                sb.append(", mediaEndTimeMs=");
                String k = wn6.k(sb, i78.f, "}");
                StringBuilder sb2 = new StringBuilder("LoadEventInfo{loadTaskId");
                xi7 xi7 = (xi7) obj3;
                sb2.append(xi7.a);
                sb2.append(", dataSpec");
                sb2.append(xi7.b);
                sb2.append(", uri");
                sb2.append(xi7.c);
                sb2.append(", responseHeaders");
                sb2.append(xi7.d);
                sb2.append(", elapsedRealtimeMs");
                sb2.append(xi7.e);
                sb2.append(", loadDurationMs");
                sb2.append(xi7.f);
                sb2.append(", bytesLoaded");
                IOException iOException = (IOException) obj4;
                udd.u("n35", iOException, "onLoadError, wasCanceled %b, loadEventInfo = %s, mediaLoadData = %s", Boolean.valueOf(z), wn6.k(sb2, xi7.g, "}"), k);
                return;
            default:
                ((hd) obj).R((gd) obj3, (i78) obj2, (IOException) obj4, z);
                return;
        }
    }

    public e8c m(int i, uoe uoe, int[] iArr) {
        bc4 bc4 = (bc4) this.o;
        bc4.getClass();
        fb4 fb4 = new fb4(0, bc4);
        int i2 = ((int[]) this.b)[i];
        ts6 i3 = ws6.i();
        uoe uoe2 = uoe;
        for (int i4 = 0; i4 < uoe2.a; i4++) {
            i3.a(new hb4(i, uoe, i4, (nb4) this.X, iArr[i4], this.c, fb4, i2));
        }
        return i3.j();
    }

    public /* synthetic */ q34(gd gdVar, yi7 yi7, i78 i78, IOException iOException, boolean z) {
        this.a = 1;
        this.o = gdVar;
        this.X = i78;
        this.b = iOException;
        this.c = z;
    }

    public /* synthetic */ q34(bc4 bc4, nb4 nb4, boolean z, int[] iArr) {
        this.a = 2;
        this.o = bc4;
        this.X = nb4;
        this.c = z;
        this.b = iArr;
    }

    public /* synthetic */ q34(Object obj, Object obj2, Parcelable parcelable, boolean z, int i) {
        this.a = i;
        this.o = obj;
        this.X = obj2;
        this.b = parcelable;
        this.c = z;
    }
}
