DECLARE @dai FLOAT =5,
@rong FLOAT =10;
DECLARE @chuvi FLOAT =  @dai+@rong*2,
@dientich FLOAT  = @dai*@rong;
--CAST CHUYỂN ĐỔI--
SELECT 'ChuVi ' + CAST(@chuvi AS VARCHAR ) as chuvi;
SELECT 'DienTich ' + CAST(@dientich AS VARCHAR) as dientich ;
