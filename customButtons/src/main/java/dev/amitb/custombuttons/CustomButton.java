package dev.amitb.custombuttons;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;

public class CustomButton extends AppCompatButton {

    private boolean isOutlineButton;
    private float cornerRadius;
    private int customBackgroundColor;
    private int outlineColor;
    private float strokeWidth;

    public CustomButton(Context context) {
        super(context);
        init(context, null);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CustomButton);

            isOutlineButton = a.getBoolean(R.styleable.CustomButton_isOutlineButton, false);
            cornerRadius = a.getDimension(R.styleable.CustomButton_cornerRadius, 0);
            customBackgroundColor = a.getColor(R.styleable.CustomButton_customBackgroundColor, Color.BLUE);
            outlineColor = a.getColor(R.styleable.CustomButton_outlineColor, Color.BLACK);
            strokeWidth = a.getDimension(R.styleable.CustomButton_strokeWidth, 2); // Default stroke width is 2dp

            a.recycle();
        }

        updateBackground();
        setTextColor(Color.WHITE);
    }

    private void updateBackground() {
        GradientDrawable backgroundDrawable = new GradientDrawable();
        backgroundDrawable.setCornerRadius(cornerRadius);
        backgroundDrawable.setColor(customBackgroundColor); // Background color

        if (isOutlineButton) {
            backgroundDrawable.setStroke((int) strokeWidth, outlineColor); // Outline color and width
        }

        setBackground(backgroundDrawable);
    }

    public void setOutlineButton(boolean outlineButton) {
        isOutlineButton = outlineButton;
        updateBackground();
    }

    public void setCornerRadius(float radius) {
        cornerRadius = radius;
        updateBackground();
    }

    public void setCustomBackgroundColor(int color) {
        customBackgroundColor = color;
        updateBackground();
    }

    public void setOutlineColor(int color) {
        outlineColor = color;
        updateBackground();
    }

    public void setStrokeWidth(float width) {
        strokeWidth = width;
        updateBackground();
    }
}