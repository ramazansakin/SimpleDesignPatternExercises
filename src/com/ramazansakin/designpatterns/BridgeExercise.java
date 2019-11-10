package com.ramazansakin.designpatterns;

interface Renderer
{
  public String whatToRenderAs();
}

abstract class Shape
{
  private Renderer renderer;
  public String name;

  public Shape(Renderer renderer)
  {
    this.renderer = renderer;
  }

  @Override
  public String toString()
  {
    return String.format("Drawing %s as %s",
      name, renderer.whatToRenderAs());
  }
}

class Triangle extends Shape
{
  public Triangle(Renderer renderer)
  {
    super(renderer);
    name = "Triangle";
  }
}

class Square2 extends Shape
{
  public Square2(Renderer renderer)
  {
    super(renderer);
    name = "Square";
  }
}

class RasterRenderer implements Renderer
{

  @Override
  public String whatToRenderAs()
  {
    return "pixels";
  }
}

class VectorRenderer implements Renderer
{
  @Override
  public String whatToRenderAs()
  {
    return "lines";
  }
}