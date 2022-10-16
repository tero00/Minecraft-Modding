package tkk0.uniqueitems.items.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class JuggModel extends ModelBiped {
    public ModelRenderer Jugg;
    public ModelRenderer JawLeft;
    public ModelRenderer JawRight;
    public ModelRenderer JawBack;
    public ModelRenderer EarHoriz;
    public ModelRenderer EarVert;
    public ModelRenderer HornLeft;
    public ModelRenderer HornRight;
    public ModelRenderer ThinHornLeft;
    public ModelRenderer ThinHornRight;

    public JuggModel() {
    	  this.textureWidth = 64;
          this.textureHeight = 64;
          this.Jugg = new ModelRenderer(this, 32, 48);
          this.Jugg.setRotationPoint(0.0F, 0.0F, 0.0F);
          this.Jugg.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
          this.JawBack = new ModelRenderer(this, 0, 44);
          this.JawBack.setRotationPoint(-3.0F, -1.8F, 0.0F);
          this.JawBack.addBox(0.0F, 0.0F, 0.0F, 6, 2, 5, 0.0F);
          this.EarHoriz = new ModelRenderer(this, 0, 32);
          this.EarHoriz.setRotationPoint(-5.5F, -7.0F, -5.0F);
          this.EarHoriz.addBox(0.0F, 0.0F, 0.0F, 11, 2, 10, 0.0F);
          this.HornLeft = new ModelRenderer(this, 20, 0);
          this.HornLeft.setRotationPoint(0.0F, -10.0F, -4.0F);
          this.HornLeft.addBox(2.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
          this.ThinHornRight = new ModelRenderer(this, 0, 0);
          this.ThinHornRight.setRotationPoint(-2.9F, -10.0F, -3.5F);
          this.ThinHornRight.addBox(0.0F, -1.0F, -1.0F, 1, 3, 9, 0.0F);
          this.EarVert = new ModelRenderer(this, 0, 22);
          this.EarVert.setRotationPoint(-5.0F, -6.5F, -2.0F);
          this.EarVert.addBox(0.0F, 0.0F, 0.0F, 10, 6, 4, 0.0F);
          this.JawLeft = new ModelRenderer(this, 0, 52);
          this.JawLeft.setRotationPoint(1.5F, -1.8F, -4.0F);
          this.JawLeft.addBox(0.0F, 0.0F, -1.0F, 4, 2, 10, 0.0F);
          this.ThinHornLeft = new ModelRenderer(this, 0, 0);
          this.ThinHornLeft.setRotationPoint(1.9F, -10.0F, -4.5F);
          this.ThinHornLeft.addBox(0.0F, -1.0F, 0.0F, 1, 3, 9, 0.0F);
          this.JawRight = new ModelRenderer(this, 0, 52);
          this.JawRight.setRotationPoint(-5.5F, -1.8F, -5.0F);
          this.JawRight.addBox(0.0F, 0.0F, 0.0F, 4, 2, 10, 0.0F);
          this.HornRight = new ModelRenderer(this, 20, 0);
          this.HornRight.setRotationPoint(-4.0F, -10.0F, -4.0F);
          this.HornRight.addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);

        this.bipedHead.addChild(EarHoriz);
        this.bipedHead.addChild(EarVert);
        this.bipedHead.addChild(HornLeft);
        this.bipedHead.addChild(HornRight);
        this.bipedHead.addChild(JawBack);
        this.bipedHead.addChild(JawRight);
        this.bipedHead.addChild(JawLeft);
        this.bipedHead.addChild(Jugg);
        this.bipedHead.addChild(ThinHornLeft);
        this.bipedHead.addChild(ThinHornRight);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	super.render(entity, f, f1, f2, f3, f4, f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
