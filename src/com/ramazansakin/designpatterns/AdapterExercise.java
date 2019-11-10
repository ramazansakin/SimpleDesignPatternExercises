package com.ramazansakin.designpatterns;

class Square
{
  public int side;

  public Square(int side)
  {
    this.side = side;
  }

  public int getSide() {
    return side;
  }

  public void setSide(int side) {
    this.side = side;
  }
}

interface Rectangle
{
  int getWidth();
  int getHeight();
  void setWidth(int width);
  void setHeight(int height);

  default int getArea()
  {
    return getWidth() * getHeight();
  }
}

class SquareToRectangleAdapter implements Rectangle
{
  private Square square;

  public SquareToRectangleAdapter(Square square)
  {
    this.square = square;
  }

  @Override
  public int getWidth()
  {
    return square.side;
  }

  @Override
  public int getHeight()
  {
    return square.side;
  }

  @Override
  public void setWidth(int width) {

  }

  @Override
  public void setHeight(int height) {

  }
}