����   2 ^  mybackpack/Firstblood  robocode/AdvancedRobot movingForward Z <init> ()V Code
     LineNumberTable LocalVariableTable this Lmybackpack/Firstblood; run  java/awt/Color
     (III)V
     setBodyColor (Ljava/awt/Color;)V
     setGunColor
     setRadarColor
  ! "  setScanColor	  $  @b�     
  ( ) * setAhead (D)V , robocode/TurnCompleteCondition
 + .  / (Lrobocode/AdvancedRobot;)V
  1 2 3 waitFor (Lrobocode/Condition;)V@g�     
  7 8 * setTurnRight@r�     
  < = * turnGunRight
  ? @ * turnGunLeft StackMapTable onScannedRobot (Lrobocode/ScannedRobotEvent;)V
  E F * fire e Lrobocode/ScannedRobotEvent; onHitByBullet (Lrobocode/HitByBulletEvent;)V@$      
  N O * back Lrobocode/HitByBulletEvent; 	onHitWall (Lrobocode/HitWallEvent;)V
  T U  reverseDirection Lrobocode/HitWallEvent;@i      
  Z [ * setBack 
SourceFile Firstblood.java !                 	   /     *� 
�                            	   �     o*� Y� � *� Y� � *� Y� � *� Y� �  *� #* %� '*� +Y*� -� 0* 4� 6* %� '* 9� ;* 9� >���       2         *  8  =  D  P  W  ^  e  l         o     A    8  B C  	   >     *� D�       
       !                G H   I J  	   @     * K� M�       
    &  '                G P   Q R  	   =     *� S�       
    +  ,                G V   U   	   o     #*� #� * W� Y*� #� * W� '*� #�           /  0  1  2  3  4 " 6        #     A      \    ]