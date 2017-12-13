package android.sabbir.com.modernlibrarys.test.material.components.p089f;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

public class C2741a {
    private static void m12236a(View view, int i) {
        float f = 800.0f;
        int i2 = i == -1 ? 1 : 0;
        int i3 = i + 1;
        view.setTranslationY(i2 != 0 ? 800.0f : 500.0f);
        view.setAlpha(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        String str = "translationY";
        float[] fArr = new float[2];
        if (i2 == 0) {
            f = 500.0f;
        }
        fArr[0] = f;
        fArr[1] = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f});
        ofFloat.setStartDelay(i2 != 0 ? 0 : ((long) i3) * 150);
        ofFloat.setDuration(((long) (i2 != 0 ? 3 : 1)) * 150);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.start();
    }

    public static void m12237a(View view, int i, int i2) {
        switch (i2) {
            case 1:
                C2741a.m12236a(view, i);
                return;
            case 2:
                C2741a.m12238b(view, i);
                return;
            case 3:
                C2741a.m12239c(view, i);
                return;
            case 4:
                C2741a.m12240d(view, i);
                return;
            default:
                return;
        }
    }

    private static void m12238b(View view, int i) {
        int i2 = i == -1 ? 1 : 0;
        int i3 = i + 1;
        view.setAlpha(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 0.5f, 1.0f});
        ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f}).start();
        ofFloat.setStartDelay(i2 != 0 ? 250 : (((long) i3) * 500) / 3);
        ofFloat.setDuration(500);
        animatorSet.play(ofFloat);
        animatorSet.start();
    }

    private static void m12239c(View view, int i) {
        int i2 = i == -1 ? 1 : 0;
        int i3 = i + 1;
        view.setTranslationX(-400.0f);
        view.setAlpha(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{-400.0f, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f});
        ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f}).start();
        ofFloat.setStartDelay(i2 != 0 ? 150 : ((long) i3) * 150);
        ofFloat.setDuration(((long) (i2 != 0 ? 2 : 1)) * 150);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.start();
    }

    private static void m12240d(View view, int i) {
        int i2 = i == -1 ? 1 : 0;
        int i3 = i + 1;
        view.setTranslationX(view.getX() + 400.0f);
        view.setAlpha(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{view.getX() + 400.0f, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f});
        ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f}).start();
        ofFloat.setStartDelay(i2 != 0 ? 150 : ((long) i3) * 150);
        ofFloat.setDuration(((long) (i2 != 0 ? 2 : 1)) * 150);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.start();
    }
}
